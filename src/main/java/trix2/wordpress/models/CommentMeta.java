package trix2.wordpress.models;

import javax.persistence.*;

@Table(name = "wp_commentmeta", indexes = {
		@Index(name = "commentmeta_comment_id", columnList = "comment_id"),
		@Index(name = "commentmeta_meta_key", columnList = "meta_key")
})
public class CommentMeta{
	@Id
	@GeneratedValue
	@Column(name = "meta_id")
	Long  id = 0l;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "comment_id")
	Comment comment = null;
	//@Column(name = "comment_id", nullable = false)
	//val commentId: Long = 0,
	@Column(name = "meta_key", nullable = true)
	String key = "";
	@Column(name = "meta_value", nullable = true, columnDefinition = "LONGTEXT")
	String  value = "";
}