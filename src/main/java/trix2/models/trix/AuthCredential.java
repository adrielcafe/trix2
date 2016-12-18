package trix2.models.trix;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rometools.utils.Strings;
import lombok.Data;
import lombok.EqualsAndHashCode;
import trix2.models.custom.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@EqualsAndHashCode(of = "id")
@Data
@Entity
@Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = {"tenantSubdomain"}),
		@UniqueConstraint(columnNames = {"network_id"})
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthCredential extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 7828328342573034733L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	public Integer getId() {
		return id;
	}

	public String facebookAppSecret;
	public String facebookAppID;

	public String googleAppSecret;
	public String googleAppID;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	public Network network;

	public boolean isFacebookLoginAllowed() {
		return Strings.isNotEmpty(facebookAppID) && Strings.isNotEmpty(facebookAppSecret);
	}

	public boolean isGoogleLoginAllowed() {
		return Strings.isNotEmpty(googleAppID) && Strings.isNotEmpty(googleAppSecret);
	}

	@PreUpdate
	public void preUpdate(){
		System.out.println("FUCK ME IN THE ASS!!");
	}
}
