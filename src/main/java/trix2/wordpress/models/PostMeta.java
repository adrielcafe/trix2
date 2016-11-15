package trix2.wordpress.models;


import javax.persistence.*;

public class PostMeta{
	@Id
    @GeneratedValue
    @Column(name = "meta_id")
    Long id = 0l;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    Post post = null;
    //@Column(name = "post_id", nullable = false)
    //val postId: Long = 0,
    @Column(name = "meta_key", nullable = true)
    String key = "";
    @Column(name = "meta_value", nullable = true)
    String value = "";
}