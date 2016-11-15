package trix2.wordpress.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Table(name = "wp_term_taxonomy", indexes = {
	@Index(name = "term_taxonomy_id_taxonomy", unique = true, columnList = "term_id, taxonomy"),
    @Index(name = "term_taxonomy_taxonomy", columnList = "taxonomy")
})
public class TermTaxonomy{
    @Id
    @GeneratedValue
    @Column(name = "term_taxonomy_id")
    Long id  = 0l;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "term_id")
    Term term  = null;
    // XXX wordpress는 FK에 null 대신 0를 넣고 수동 조인...
    //@Column(name = "term_id", nullable = false)
    // termId Long = 0
    @Column(name = "taxonomy", length = 32, nullable = false)
    String taxonomy  = "";
    @Column(name = "description", nullable = false, columnDefinition = "LONGTEXT")
    String description  = "";
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent")
    TermTaxonomy parent  = null;
    // XXX wordpress는 FK에 null 대신 0를 넣고 수동 조인...
    //@Column(name = "parent", nullable = false)
    // parentId Long = 0,
    @Column(name = "count", nullable = false)
    Long count  = 0l;
    //---------------------------------------------------------
    // XXX wordpress는 한 개의 JoinTable로 post-taxonomy & link-taxonomy 두 개의  many-to-many 수동 조인...
    @OneToMany(mappedBy = "taxonomy")
    List<TermRelationship> relationships = new ArrayList<>();
}
