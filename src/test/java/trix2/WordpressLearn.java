package trix2;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.MappedSchema;
import org.jooq.conf.MappedTable;
import org.jooq.conf.RenderMapping;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.Assert;
import trix2.config.database.DatabaseConfig;
import trix2.wordpress.WordpressConfig;
import trix2.wordpress.models.Post;
//import trix2.wordpress.tables.WpPosts;
//import trix2.wordpress.tables.WpUsers;

import javax.sql.DataSource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class WordpressLearn {

	@Before
	public void setup() throws Exception {
	}

	@Autowired
	DataSource dataSource;

	@org.junit.Test
	public void jooqTest(){
		Settings settings = new Settings()
				.withRenderMapping(new RenderMapping()
						.withSchemata(
								new MappedSchema().withInput("trix")
										.withOutput("multiwp")
										.withTables(
												new MappedTable().withInput("wp_posts")
														.withOutput("wp_2_posts"))));

// Add the settings to the Configuration
		DSLContext dsl = DSL.using(dataSource, SQLDialect.MYSQL, settings);

// Run queries with the "mapped" configuration
//		List<Post> posts = dsl.select().from(WpPosts.WP_POSTS).join(WpUsers.WP_USERS)
//				.on(WpPosts.WP_POSTS.POST_AUTHOR.equal(WpUsers.WP_USERS.ID)).fetchInto(Post.class);
//		Assert.notNull(posts);
	}
}