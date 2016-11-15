package trix2.models.relational;

import trix2.models.custom.BaseEntity;
import lombok.AccessLevel;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@lombok.Getter
@lombok.Setter
@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"tenantSubdomain", "deviceCode"}))
public class MobileDevice extends BaseEntity {

	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	@NotEmpty
	public String deviceCode;

	public Double lat;

	public Double lng;

	public boolean active;

//	@Enumerated(EnumType.STRING)
//	public Constants.MobilePlatform type;

	@Override
	public String toString() {
		if(deviceCode != null)
			return deviceCode;
		else
			return super.toString();
	}
}
