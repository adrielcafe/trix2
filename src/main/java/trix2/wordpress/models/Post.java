package trix2.wordpress.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "wp_posts", indexes = {
		@Index(name = "post_name", columnList = "post_name"),
		@Index(name = "post_type_status_date_id", columnList = "post_type, post_status, post_date, id"),
		@Index(name = "post_parent", columnList = "post_parent"),
		@Index(name = "post_author", columnList = "post_author")
})
public class Post{
	@Id
	@GeneratedValue
	@Column(name = "id")
	Long id = 0l;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_author")
	User author = null;

	// XXX: wordpress는 FK에 null 대신 0를 넣고 수동 조인...
	//@Column(name = "post_author", nullable = false)
	//val authorId: Long = 0,
	@Column(name = "post_date", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	LocalDateTime date = LocalDateTime.MIN;

	@Column(name = "post_date_gmt", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	LocalDateTime dateGMT = LocalDateTime.MIN;

	@Column(name = "post_content", nullable = false, columnDefinition = "LONGTEXT")
	String content = "";

	@Column(name = "post_title", nullable = false, columnDefinition = "TEXT")
	String title = "";

	@Column(name = "post_excerpt", nullable = false, columnDefinition = "TEXT")
	String excerpt = "";

	@Column(name = "post_status", length = 20, nullable = false)
	String status = "publish";

	@Column(name = "comment_status", length = 20, nullable = false)
	String commentStatus = "open";

	@Column(name = "ping_status", length = 20, nullable = false)
	String pingStatus = "open";

	@Column(name = "post_password", length = 20, nullable = false)
	String password = "";

	@Column(name = "post_name", length = 20, nullable = false)
	String name = "";

	@Column(name = "to_ping", nullable = false, columnDefinition = "TEXT")
	String toPing = "";

	@Column(name = "pinged", nullable = false, columnDefinition = "TEXT")
	String pinged = "";

	@Column(name = "post_modified", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	LocalDateTime modified = LocalDateTime.MIN;

	@Column(name = "post_modified_gmt", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
	LocalDateTime modifiedGMT = LocalDateTime.MIN;

	@Column(name = "post_content_filtered", columnDefinition = "LONGTEXT")
	String contentFiltered = "";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "post_parent")
	Post parent = null;
	// XXX: wordpress는 FK에 null 대신 0를 넣고 수동 조인...
	//@Column(name = "post_parent", nullable = false)
	//val parentId: Long = 0,
	@Column(name = "guid", length = 255, nullable = false)
	String guid = "";

	@Column(name = "menu_order", nullable = false)
	Integer menuOrder = 0;

	@Column(name = "post_type", length = 20, nullable = false)
	String type = "post";

	@Column(name = "post_mime_type", length = 100, nullable = false)
	String mimeType = "";

	@Column(name = "comment_count", nullable = false)
	Long commentCount = 0l;
	//---------------------------------------------------------
	 @OneToMany(mappedBy = "post")
	List<PostMeta> metas;
	 @OneToMany(mappedBy = "parent")
	List children = new ArrayList();
	@OneToMany(mappedBy = "post")
	List<Comment> comments = new ArrayList<>();
	// XXX: wordpress는 한 개의 JoinTable로 post-taxonomy & link-taxonomy 두 개의  many-to-many 수동 조인...
	//@OneToMany(mappedBy = "objectId")
	//val relationships: List<TermRelationship> = listOf()
}