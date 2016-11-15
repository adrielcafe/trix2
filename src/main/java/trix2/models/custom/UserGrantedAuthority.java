package trix2.models.custom;

import trix2.models.User;
import org.springframework.security.core.GrantedAuthority;

public class UserGrantedAuthority implements GrantedAuthority {

	public static final String USER_AUTHORITY = "USER";
	public static final String ADMIN_AUTHORITY = "ADMIN";
    public static final String SUPERUSER_AUTHORITY = "SUPERUSER";

    public String authority;

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