package trix2.wordpress.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@IdClass(TermRelationshipPK.class)
@Table(name = "wp_term_relationships", indexes = {
		@Index(name = "term_relationship_term_taxonomy_id", columnList = "term_taxonomy_id")
})
public class TermRelationship{
    @Id
    @Column(name = "object_id", nullable = false)
    Long objectId  = 0l;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "object_id")
    // post Post? = null,
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "object_id")
    // link Link? = null,
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "term_taxonomy_id")
    TermTaxonomy taxonomy  = null;
    //@Column(name = "term_taxonomy_id", nullable = false)
    // taxonomyId Long = 0,
    @Column(name = "term_order")
    Integer order  = 0;
}