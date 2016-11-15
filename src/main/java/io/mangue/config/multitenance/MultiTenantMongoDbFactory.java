package io.mangue.config.multitenance;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

public class MultiTenantMongoDbFactory extends SimpleMongoDbFactory {

    private String defaultDatabaseName;

    public MultiTenantMongoDbFactory(MongoClient mongo, String database) {
        super(mongo, database);
        this.defaultDatabaseName = new String(database);
		org.jcodec.common.logging.Logger.debug("Instantiating " + MultiTenantMongoDbFactory.class.getName() + " with " +
				"default database name: " + defaultDatabaseName);
    }

    @Override
    public DB getDb() {
        final String subdomain = TenantContextHolder.getTenantSubdomain();
        final String dbToUse;
        if(subdomain == null)
            dbToUse = defaultDatabaseName;
        else
            dbToUse = subdomain ;

		org.jcodec.common.logging.Logger.debug("Acquiring database: " + dbToUse);
        return super.getDb(dbToUse);
    }
}