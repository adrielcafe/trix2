package trix2.models;

import lombok.AccessLevel;
import lombok.Setter;
import trix2.models.custom.BaseEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;


@lombok.Getter @Setter @lombok.NoArgsConstructor
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"hash", "tenantSubdomain"}))
public class File extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 7828358342575034733L;

	public static final String INTERNAL = "I";
	public static final String EXTERNAL = "E";

	public static final String DIR_IMAGES = "images";
	public static final String DIR_VIDEO = "videos";
	public static final String DIR_AUDIO = "audios";
	public static final String DIR_DOC = "docs";


	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	@NotNull
	@Size(min = 1, max = 1)
	public String type;

	public String directory;

	public String mime;

	public String name;

	public String url;

	public String hash;

	public Long size;

	public Boolean original;

	@Lob
	public String meta;

	public String getExtension() {
		if (mime != null && mime.split("/").length == 2)
			return mime.split("/")[1];

		return null;
	}
}