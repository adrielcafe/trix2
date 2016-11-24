package trix2.wordpress.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(indexes = {
		@Index(name = "user_login", columnList = "user_login"),
		@Index(name = "user_nicename", columnList = "user_nicename")
})
public class User{
    @Id
    @GeneratedValue
    @Column(name = "id")
	Long id  = 0l;
    @Column(name = "user_login", length = 60, nullable = false)
	String login  = "";
    @Column(name = "user_pass", length = 64, nullable = false)
	String password  = "";
    @Column(name = "user_nicename", length = 50, nullable = false)
	String niceName  = "";
    @Column(name = "user_email", length = 100, nullable = false)
	String email  = "";
    @Column(name = "user_url", length = 100, nullable = false)
	String url  = "";
    @Column(name = "user_registered", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 000000'")
	LocalDateTime registered  = LocalDateTime.MIN;
    @Column(name = "user_activation_key", length = 60, nullable = false)
	String activationKey  = "";
    @Column(name = "user_status", nullable = false)
	Integer status  = 0;
    @Column(name = "display_name", length = 250, nullable = false)
	String displayName  = "";
    //---------------------------------------------------------
    @OneToMany(mappedBy = "user")
	List<UserMeta> metas  = new ArrayList<>();

    @OneToMany(mappedBy = "author")
	List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "user")
	List<Comment> comments = new ArrayList<>();
}