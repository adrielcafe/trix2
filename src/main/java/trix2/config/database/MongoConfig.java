//package trix2.config.database;
//
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientOptions;
//import trix2.config.multitenance.MultiTenantMongoDbFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
//import org.springframework.boot.autoconfigure.mongo.MongoProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.data.mongodb.MongoDbFactory;
//import org.springframework.data.mongodb.core.MongoTemplate;
//
//import javax.annotation.PreDestroy;
//import java.net.UnknownHostException;
//
///**
// * Created by misael on 02/12/2015.
// */
//
//@Configuration
//@ConditionalOnClass({ MongoClient.class, MongoTemplate.class })
//@EnableConfigurationProperties(MongoProperties.class)
//@AutoConfigureAfter(MongoAutoConfiguration.class)
//public class MongoConfig {
//
//    @Autowired
//    private MongoProperties properties;
//
//    @Autowired
//    private Environment environment;
//
//    private MongoClient mongo;
//
//	@PreDestroy
//	public void close() throws UnknownHostException {
//		if (this.mongo != null) {
//			this.mongo.close();
//		}
//	}
//
//    @Bean
//	@ConditionalOnMissingBean(MongoDbFactory.class)
//    public MultiTenantMongoDbFactory mongoDbFactory(MongoClient mongo) throws Exception {
//        String database = this.properties.getMongoClientDatabase();
//        return new MultiTenantMongoDbFactory(mongo, database);
//    }
//
//    @Autowired(required = false)
//    private MongoClientOptions options;
//
//    @Bean
//	@ConditionalOnMissingBean
//    public MongoClient mongo() throws UnknownHostException {
//        this.mongo = this.properties.createMongoClient(this.options, this.environment);
//        return this.mongo;
//    }
//}
