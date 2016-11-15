package trix2.wordpress.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "wp_links", indexes = {
		@Index(name = "link_visible", columnList = "link_visible")
})
public class Link{
    @Id
    @GeneratedValue
    @Column(name = "link_id")
	Long id  = 0l;
    @Column(name = "link_url", length = 255, nullable = false)
	String url  = "";
    @Column(name = "link_name", length = 255, nullable = false)
	String name  = "";
    @Column(name = "link_image", length = 255, nullable = false)
	String image  = "";
    @Column(name = "link_target", length = 25, nullable = false)
	String target  = "";
    @Column(name = "link_description", length = 255, nullable = false)
	String description  = "";
    @Column(name = "link_visible", length = 20, nullable = false)
	String visible  = "Y";
    @Column(name = "link_owner", nullable = false)
	Long owner  = 1l;
    @Column(name = "link_rating", nullable = false)
	Integer rating  = 0;
    @Column(name = "link_updated", nullable = false, columnDefinition = "DATETIME DEFAULT '0000-00-00 000000'")
	LocalDateTime updated  = LocalDateTime.MIN;
    @Column(name = "link_rel", length = 255, nullable = false)
	String rel  = "";
    @Column(name = "link_notes", columnDefinition = "MEDIUMTEXT")
	String notes  = "";
    @Column(name = "link_rss", length = 255, nullable = false)
	String rss  = "";
    //---------------------------------------------------------
    // XXX wordpress는 한 개의 JoinTable로 post-taxonomy & link-taxonomy 두 개의  many-to-many 수동 조인...
    //@OneToMany(mappedBy = "objectId")
    // relationships List<TermRelationship> = listOf()
}