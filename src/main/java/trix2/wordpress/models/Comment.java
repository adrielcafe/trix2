package trix2.wordpress.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Table(name = "wp_comments", indexes = {
		@Index(name = "comment_post_id", columnList = "comment_post_id"),
		@Index(name = "comment_approved_date_gmt", columnList = "comment_approved, comment_date_gmt"),
		@Index(name = "comment_date_gmt", columnList = "comment_date_gmt"),
		@Index(name = "comment_parent", columnList = "comment_parent"),
		@Index(name = "comment_author_email", columnList = "comment_author_email")
})
public class Comment{
        @Id
        @GeneratedValue
        @Column(name = "comment_id")
        Long id = 0l;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "comment_post_id")
        Post post = null;
        //@JoinColumn(name = "comment_post_id", nullable = false)
        //val postId: Long = 0,
        @Column(name = "comment_author", nullable = false, columnDefinition = "TINYTEXT")
        String author = "";

        @Column(name = "comment_author_email", length = 100, nullable = false)
        String authorEmail = "";

        @Column(name = "comment_author_url", length = 200, nullable = false)
        String authorUrl = "";

        @Column(name = "comment_author_ip", length = 100, nullable = false)
        String authorIp = "";

        @Column(name = "comment_date", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
        LocalDateTime date = LocalDateTime.MIN;

        @Column(name = "comment_date_gmt", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 00:00:00'")
        LocalDateTime dateGMT = LocalDateTime.MIN;

        @Column(name = "comment_content", nullable = false, columnDefinition = "TEXT")
        String content = "";

        @Column(name = "comment_karma", nullable = false)
        Integer karma = 0;

        @Column(name = "comment_approved", length = 20, nullable = false)
        String approved = "1";

        @Column(name = "comment_agent", length = 255, nullable = false)
        String agent = "";

        @Column(name = "comment_type", length = 20, nullable = false)
        String type = "";

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "comment_parent")
        Comment parent = null;
        //val parentId: Long = 0,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        User user = null;
        //@Column(name = "user_id", nullable = false)
        //val userId: Long = 0,
        //---------------------------------------------------------
        @OneToMany(mappedBy = "comment")
        List<CommentMeta> metas = new ArrayList<CommentMeta>();

        @OneToMany(mappedBy = "parent")
        List<Comment> children = new ArrayList<>();
}
