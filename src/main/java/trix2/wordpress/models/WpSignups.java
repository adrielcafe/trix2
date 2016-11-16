package trix2.wordpress.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_signups", schema = "multiwp", catalog = "")
public class WpSignups {
	private Long signupId;
	private String domain;
	private String path;
	private String title;
	private String userLogin;
	private String userEmail;
	private Timestamp registered;
	private Timestamp activated;
	private Byte active;
	private String activationKey;
	private String meta;

	@Id
	@Column(name = "signup_id", nullable = false)
	public Long getSignupId() {
		return signupId;
	}

	public void setSignupId(Long signupId) {
		this.signupId = signupId;
	}

	@Basic
	@Column(name = "domain", nullable = false, length = 200)
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Basic
	@Column(name = "path", nullable = false, length = 100)
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Basic
	@Column(name = "title", nullable = false, length = -1)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Basic
	@Column(name = "user_login", nullable = false, length = 60)
	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	@Basic
	@Column(name = "user_email", nullable = false, length = 100)
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Basic
	@Column(name = "registered", nullable = false)
	public Timestamp getRegistered() {
		return registered;
	}

	public void setRegistered(Timestamp registered) {
		this.registered = registered;
	}

	@Basic
	@Column(name = "activated", nullable = false)
	public Timestamp getActivated() {
		return activated;
	}

	public void setActivated(Timestamp activated) {
		this.activated = activated;
	}

	@Basic
	@Column(name = "active", nullable = false)
	public Byte getActive() {
		return active;
	}

	public void setActive(Byte active) {
		this.active = active;
	}

	@Basic
	@Column(name = "activation_key", nullable = false, length = 50)
	public String getActivationKey() {
		return activationKey;
	}

	public void setActivationKey(String activationKey) {
		this.activationKey = activationKey;
	}

	@Basic
	@Column(name = "meta", nullable = true, length = -1)
	public String getMeta() {
		return meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpSignups wpSignups = (WpSignups) o;

		if (signupId != null ? !signupId.equals(wpSignups.signupId) : wpSignups.signupId != null) return false;
		if (domain != null ? !domain.equals(wpSignups.domain) : wpSignups.domain != null) return false;
		if (path != null ? !path.equals(wpSignups.path) : wpSignups.path != null) return false;
		if (title != null ? !title.equals(wpSignups.title) : wpSignups.title != null) return false;
		if (userLogin != null ? !userLogin.equals(wpSignups.userLogin) : wpSignups.userLogin != null) return false;
		if (userEmail != null ? !userEmail.equals(wpSignups.userEmail) : wpSignups.userEmail != null) return false;
		if (registered != null ? !registered.equals(wpSignups.registered) : wpSignups.registered != null) return false;
		if (activated != null ? !activated.equals(wpSignups.activated) : wpSignups.activated != null) return false;
		if (active != null ? !active.equals(wpSignups.active) : wpSignups.active != null) return false;
		if (activationKey != null ? !activationKey.equals(wpSignups.activationKey) : wpSignups.activationKey != null)
			return false;
		if (meta != null ? !meta.equals(wpSignups.meta) : wpSignups.meta != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = signupId != null ? signupId.hashCode() : 0;
		result = 31 * result + (domain != null ? domain.hashCode() : 0);
		result = 31 * result + (path != null ? path.hashCode() : 0);
		result = 31 * result + (title != null ? title.hashCode() : 0);
		result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
		result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
		result = 31 * result + (registered != null ? registered.hashCode() : 0);
		result = 31 * result + (activated != null ? activated.hashCode() : 0);
		result = 31 * result + (active != null ? active.hashCode() : 0);
		result = 31 * result + (activationKey != null ? activationKey.hashCode() : 0);
		result = 31 * result + (meta != null ? meta.hashCode() : 0);
		return result;
	}
}
