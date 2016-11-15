package trix2.wordpress.models;

import javax.persistence.*;

@Table(name = "wp_options", indexes = {
		@Index(name = "option_name", unique = true, columnList = "option_name")
})
public class Option{
    @Id
    @GeneratedValue
    @Column(name = "option_id")
    Long id  = 0l;
    @Column(name = "option_name", length = 64, unique = true, nullable = false)
    String name  = "";
    @Column(name = "option_value", nullable = false, columnDefinition = "LONGTEXT")
    String value  = "";
    @Column(name = "autoload", length = 20, nullable = false)
    String autoload  = "yes";
}
