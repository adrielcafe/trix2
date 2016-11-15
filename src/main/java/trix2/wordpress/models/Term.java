package trix2.wordpress.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "wp_terms", indexes = {
		@Index(name = "term_slug", unique = true, columnList = "slug"),
        @Index(name = "term_name", columnList = "name")
})
public class Term{
    @Id
    @GeneratedValue
    @Column(name = "term_id")
    Long id  = 0l;
    @Column(name = "name", length = 200, nullable = false)
    String name  = "";
    @Column(name = "slug", length = 191, nullable = false) // @@iolo 200->191
    String slug  = "";
    @Column(name = "term_group", nullable = false)
    Long group  = 0l;
    //---------------------------------------------------------
    @OneToMany(mappedBy = "term")
    List<TermMeta> metas  = new ArrayList<>();
    @OneToMany(mappedBy = "term")
    List<TermTaxonomy> taxonomies  = new ArrayList<>();
}