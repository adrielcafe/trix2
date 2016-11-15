package io.mangue.config.web;

import io.mangue.interceptors.DomainInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by misael on 17/10/2015.
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Value("${spring.profiles.active}")
    public String profile;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(domainInterceptor());
    }

    @Bean
    public DomainInterceptor domainInterceptor(){
        return new DomainInterceptor();
    }

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedHeaders("Authorization","Content-Type","Content-Range","Content-Disposition","Content-Description",
						"X-Requested-With","accept","Origin","Access-Control-Request-Method",
						"Access-Control-Request-Headers","Location")
				.allowCredentials(true)
				.maxAge(86400)
				.exposedHeaders("Authorization","Content-Type","Content-Range","Content-Disposition","Content-Description",
						"X-Requested-With","accept","Origin","Access-Control-Request-Method",
						"Access-Control-Request-Headers","Location")
				.allowedMethods("GET","POST","DELETE","PUT","HEAD","OPTIONS");

	}

}
