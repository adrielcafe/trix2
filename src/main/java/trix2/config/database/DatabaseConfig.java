package trix2.config.database;

import com.zaxxer.hikari.HikariDataSource;
import org.hibernate.MultiTenancyStrategy;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.FieldRetrievingFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import trix2.config.flyway.FlywayIntegrator;

import javax.sql.DataSource;
import java.util.Map;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
@EnableJpaAuditing(dateTimeProviderRef = "dateTimeProvider")
@EnableJpaRepositories(
		basePackages = {"trix2.repositories"}
		,repositoryFactoryBeanClass = RepositoryFactoryBean.class
)
public class DatabaseConfig {

	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;

	@Bean
	@Primary
	public DataSource dataSource() {
		HikariDataSource ds = new HikariDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setJdbcUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.addDataSourceProperty("cachePrepStmts", "true");
		ds.addDataSourceProperty("prepStmtCacheSize", "300");
		ds.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

//		MultitenantRoutingDataSource multitenantDataSource = new MultitenantRoutingDataSource();
//		multitenantDataSource.setDefaultTargetDataSource(ds);
//		multitenantDataSource.setTargetDataSources(ds);
//		return multitenantDataSource;
		return ds;
	}

	@Bean
	@DependsOn("dataSource")
	public FlywayIntegrator flywayIntegrator() {
		return new FlywayIntegrator();
	}

	@Bean(name="entityManagerFactory")
	@DependsOn("flywayIntegrator")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(CurrentTenantResolverImpl currentTenantResolverImpl, SchemaPerTenantConnectionProvider tenantIdentifierResolver) {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(dataSource());
		factory.setPersistenceUnitName("trix2");
//		factory.setPersistenceProviderClass(MultiTenantHibernatePersistence.class);
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan("trix2.models", "org.javers.spring.model");
		factory.setJpaProperties(hibernateProperties());

		Map<String, Object> jpaProperties = new java.util.HashMap<>();
		jpaProperties.put(Environment.MULTI_TENANT, MultiTenancyStrategy.SCHEMA);
		jpaProperties.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER, tenantIdentifierResolver);
		jpaProperties.put(Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, currentTenantResolverImpl);
		factory.setJpaPropertyMap(jpaProperties);

		factory.afterPropertiesSet();

		return factory;
	}

	Properties hibernateProperties() {
		return new Properties() {
			{
//				setProperty("hibernate.hbm2ddl.auto", "update");
				setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
				setProperty("hibernate.globally_quoted_identifiers", "false");
				setProperty("hibernate.show_sql", "true");
				setProperty("hibernate.format", "true");
				setProperty("hibernate.current_session_context_class", "thread");
				setProperty("hibernate.default_batch_fetch_size", "200");
				setProperty("hibernate.classloading.use_current_tccl_as_parent", "false");
				setProperty("hibernate.connection.characterEncoding", "utf8");
				setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
//				setProperty("hibernate.multiTenancy", "SCHEMA");
//				setProperty("hibernate.tenant_identifier_resolver", "trix2.config.database.CurrentTenantResolverImpl");
//				setProperty("hibernate.multi_tenant_connection_provider", "trix2.config.database.SchemaPerTenantConnectionProvider");
			}
		};
	}


	@Bean
	public JpaTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory){
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
		return jpaTransactionManager;
	}

//	@Bean
//	public DataSourceConnectionProvider dataSourceConnectionProvider(){
//		return new DataSourceConnectionProvider(dataSource());
//	}
//
//	@Bean
//	public DefaultConfiguration defaultConfiguration(){
//		DefaultConfiguration defaultConfiguration = new DefaultConfiguration();
//		defaultConfiguration.setConnectionProvider(dataSourceConnectionProvider());
//		defaultConfiguration.setSQLDialect(SQLDialect.MYSQL);
//		return defaultConfiguration;
//	}
//
//	@Bean
//	public DSLContext dslContext(){
//		return new DefaultDSLContext(defaultConfiguration());
//	}

	@Bean
	public FieldRetrievingFactoryBean dateTimeProvider() {
		FieldRetrievingFactoryBean fieldRetrievingFactoryBean = new FieldRetrievingFactoryBean();
		fieldRetrievingFactoryBean.setStaticField("org.springframework.data.auditing.CurrentDateTimeProvider.INSTANCE");
		return fieldRetrievingFactoryBean;
	}

	@Bean
	public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
		return new PersistenceExceptionTranslationPostProcessor();
	}
}
