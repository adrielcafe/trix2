package trix2.config;

import trix2.repositories.search.ESRepository;
import trix2.search.ESRepositoryFactoryBean;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.ImmutableSettings;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(
		basePackageClasses = {ESRepository.class},
		repositoryFactoryBeanClass = ESRepositoryFactoryBean.class
)
public class ElasticSearchConfig {

	@Value("${spring.data.elasticsearch.host}")
	private String host;
	@Value("${spring.data.elasticsearch.port}")
	private Integer port;
	@Value("${spring.data.elasticsearch.cluster-name}")
	private String cluster;
	@Value("${spring.data.elasticsearch.username:'mangue'}")
	private String user;
	@Value("${spring.data.elasticsearch.password:'mangue'}")
	private String password;
	@Value("${spring.data.elasticsearch.properties.shield.enabled:false}")
	private boolean shieldEnabled;

	@Bean
	public Client elasticSearchClient() {

		ImmutableSettings.Builder builder = ImmutableSettings.settingsBuilder().put("cluster.name", cluster);

		Settings settings = null;

		if(shieldEnabled)
			settings = builder.put("shield.user", user + ":" + password).build();
		else
			settings = builder.build();

		return new TransportClient(settings).addTransportAddress(new InetSocketTransportAddress(host, port));
	}

	@Bean
	public ElasticsearchOperations elasticsearchTemplate() {
		return new ElasticsearchTemplate(elasticSearchClient());
	}
}
