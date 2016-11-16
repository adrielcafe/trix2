package trix2.wordpress.models;

import javax.persistence.*;

@Table(name = "wp_usermeta", indexes = {
	@Index(name = "usermeta_user_id", columnList = "user_id"),
    @Index(name = "usermeta_meta_key", columnList = "meta_key")
})
public class UserMeta{
    @Id
    @GeneratedValue
    @Column(name = "umeta_id", nullable = false)
    Long id  = 0l;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    User user = null;
    //@Column(name = "user_id", nullable = false)
    // userId Long = 0,
    @Column(name = "meta_key", length = 255, nullable = true)
    String key  = "";
    @Column(name = "meta_value", nullable = true, columnDefinition = "LONGTEXT")
    String value = "";
}