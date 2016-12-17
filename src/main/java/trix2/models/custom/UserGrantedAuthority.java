package trix2.models.custom;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import trix2.models.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@lombok.Getter
@lombok.Setter
@Entity
@Table(name="authorities")
public class UserGrantedAuthority implements GrantedAuthority {

	public static final String USER_AUTHORITY = "USER";
	public static final String ADMIN_AUTHORITY = "ADMIN";
    public static final String SUPERUSER_AUTHORITY = "SUPERUSER";

	@Id
	@Setter(AccessLevel.NONE)
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	@JsonIgnore
	@ManyToOne
	public User user;

	@NotNull
    public String authority;

	protected UserGrantedAuthority() {
		this(null, USER_AUTHORITY);
	}

	public UserGrantedAuthority(User user) {
		this(user, USER_AUTHORITY);
	}

	public UserGrantedAuthority(String authority) {
		this(null, authority);
	}

	public UserGrantedAuthority(User anonymousUser, String role_anonymous) {
	}

	@Override
	public String toString() {
		return authority;
	}

	@Override
	public String getAuthority() {
		return authority;
	}
}