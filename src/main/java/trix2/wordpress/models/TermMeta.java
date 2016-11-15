package trix2.wordpress.models;

import javax.persistence.*;

@Table(name = "wp_termmeta", indexes = {
		@Index(name = "termmeta_term_id", columnList = "term_id"),
		@Index(name = "termmeta_meta_key", columnList = "meta_key")
})
public class TermMeta{
    @Id
    @GeneratedValue
    @Column(name = "meta_id")
    Long id  = 0l;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "term_id")
    Term term  = null;
    // XXX wordpress는 FK에 null 대신 0를 넣고 수동 조인...
    //@Column(name="term_id", nullable = false)
    // termId Long = 0,
    @Column(name = "meta_key", nullable = true)
    String key  = "";
    @Column(name = "meta_value", nullable = true, columnDefinition = "LONGTEXT")
    String value  = "";
}