package trix2.models.trix;

import lombok.AccessLevel;
import lombok.Setter;
import trix2.models.custom.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@lombok.Getter
@Setter
@lombok.NoArgsConstructor
@lombok.EqualsAndHashCode(callSuper = false)
@Entity
public class Picture extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -6407170001176054415L;

	public Picture(String sizeTag, File file) {
		this.sizeTag = sizeTag;
		this.file = file;
	}

	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	public Integer height;

	public Integer width;

	public String sizeTag;

	@NotNull
	@ManyToOne(cascade=CascadeType.MERGE)
	public File file;
}
