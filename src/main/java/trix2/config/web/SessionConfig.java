package trix2.config.web;

import trix2.config.cache.MultitenantCacheManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.HttpSessionStrategy;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableCaching
@EnableRedisHttpSession
public class SessionConfig extends CachingConfigurerSupport {

	@Value("${trix.auth.header:'x-auth-trix-token'}")
	private String trixAuthHeader;
	@Value("${spring.redis.host}")
	private String redisHost;
	@Value("${spring.redis.port}")
	private int redisPort;
	@Value("${spring.redis.password:}")
	private String redisPassword;
	@Value("${spring.redis.db:''}")
	private Integer redisDB;

	public RedisTemplate redisTemplate() {
		RedisTemplate redisTemplate = new RedisTemplate();
		redisTemplate.setConnectionFactory(redisConnectionFactory());
		redisTemplate.setKeySerializer(new StringRedisSerializer());
		return redisTemplate;
	}

	@Bean
	public CacheManager cacheManager() {
		Map<String, Map<RedisTemplate, Integer>> templates = new HashMap<>();
		return new MultitenantCacheManager(templates);
	}

	@Bean
	public HttpSessionStrategy httpSessionStrategy() {
		CookieAndHeaderHttpSessionStrategy sessionStrategy = new CookieAndHeaderHttpSessionStrategy();
		sessionStrategy.setCookieName("JSESSIONID");
		sessionStrategy.setHeaderName(trixAuthHeader);

		return sessionStrategy;
	}

	@Bean
	public RedisConnectionFactory redisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setDatabase(redisDB);
		jedisConnectionFactory.setHostName(redisHost);
		jedisConnectionFactory.setPort(redisPort);
		if (redisPassword != null && !redisPassword.isEmpty()) {
			jedisConnectionFactory.setPassword(redisPassword);
		}
		return jedisConnectionFactory;
	}

	@Bean
	public RedisOperationsSessionRepository sessionRepository(@Qualifier("sessionRedisTemplate")
																	  RedisOperations<Object, Object>
																		  sessionRedisTemplate) {
		RedisOperationsSessionRepository sessionRepository = new RedisOperationsSessionRepository(sessionRedisTemplate);
		sessionRepository.setDefaultMaxInactiveInterval(345600);

		return sessionRepository;
	}
}
