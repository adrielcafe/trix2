package trix2.wordpress;

import com.zaxxer.hikari.HikariDataSource;
import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import trix2.wordpress.exception.JOOQToSpringExceptionTransformer;

import javax.sql.DataSource;

/**
 * Created by misael on 11/15/2016.
 */
@Configuration
@ComponentScan({"trix2.wordpress"})
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class WordpressConfig {

	@Value("${spring.datasource.driver-class-name:'com.mysql.jdbc.Driver'}")
	private String driver;

//	private static final String PROPERTY_NAME_DB_SCHEMA_SCRIPT = "db.schema.script";

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${jooq.sql.dialect:'MYSQL'}")
	private String dialect;
	@Autowired
	private Environment env;

	@Autowired
	DataSource dataSource;

//	@Bean(destroyMethod = "close", name = "jooqDS")
//	public DataSource dataSource() {
//		HikariDataSource ds = new HikariDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setJdbcUrl(url);
//		ds.setUsername(username);
//		ds.setPassword(password);
//		ds.addDataSourceProperty("cachePrepStmts", "true");
//		ds.addDataSourceProperty("prepStmtCacheSize", "300");
//		ds.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
//
//		return ds;
//	}

	@Bean
	public LazyConnectionDataSourceProxy lazyConnectionDataSource() {
		return new LazyConnectionDataSourceProxy(dataSource);
	}

	@Bean
	public TransactionAwareDataSourceProxy transactionAwareDataSource() {
		return new TransactionAwareDataSourceProxy(lazyConnectionDataSource());
	}

	@Bean
	public DataSourceTransactionManager transactionManager() {
		return new DataSourceTransactionManager(lazyConnectionDataSource());
	}

	@Bean
	public DataSourceConnectionProvider connectionProvider() {
		return new DataSourceConnectionProvider(transactionAwareDataSource());
	}

	@Bean
	public JOOQToSpringExceptionTransformer jooqToSpringExceptionTransformer() {
		return new JOOQToSpringExceptionTransformer();
	}

	@Bean
	public DefaultConfiguration configuration() {
		DefaultConfiguration config = new DefaultConfiguration();

		config.set(connectionProvider());
		config.set(new DefaultExecuteListenerProvider(
				jooqToSpringExceptionTransformer()
		));

		SQLDialect sqldialect = SQLDialect.valueOf(dialect);
		config.set(sqldialect);

		return config;
	}

	@Bean
	public DefaultDSLContext dsl() {
		return new DefaultDSLContext(configuration());
	}

//	@Bean
//	public DataSourceInitializer dataSourceInitializer() {
//		DataSourceInitializer initializer = new DataSourceInitializer();
//		initializer.setDataSource(dataSource());
//
//		ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
//		populator.addScript(
//				new ClassPathResource(env.getRequiredProperty(PROPERTY_NAME_DB_SCHEMA_SCRIPT))
//		);
//
//		initializer.setDatabasePopulator(populator);
//		return initializer;
//	}

	public static void main (String args[]){
		try {
			org.jooq.util.GenerationTool.main(new String[]{"src/main/resources/jooq-codegen.xml"});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}