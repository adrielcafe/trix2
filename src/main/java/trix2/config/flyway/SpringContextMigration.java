package trix2.config.flyway;

import org.flywaydb.core.api.migration.spring.SpringJdbcMigration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class SpringContextMigration implements SpringJdbcMigration {

	protected JdbcTemplate jdbc;

	@Value("${trix.config.simplesetup}")
	public boolean simplesetup = false;

	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {
		if(!simplesetup) {
			this.jdbc = jdbcTemplate;
			FlywayIntegrator.autowire(this);
			migrate();
		}
	}

	public abstract void migrate() throws Exception;
}