package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_users", schema = "multiwp", catalog = "")
public class WpUsers {
	private Long id;
	private String userLogin;
	private String userPass;
	private String userNicename;
	private String userEmail;
	private String userUrl;
	private Timestamp userRegistered;
	private String userActivationKey;
	private Integer userStatus;
	private String displayName;
	private Byte spam;
	private Byte deleted;

	@Id
	@Column(name = "ID", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	@Column(name = "user_pass", nullable = false, length = 255)
	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Basic
	@Column(name = "user_nicename", nullable = false, length = 50)
	public String getUserNicename() {
		return userNicename;
	}

	public void setUserNicename(String userNicename) {
		this.userNicename = userNicename;
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
	@Column(name = "user_url", nullable = false, length = 100)
	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	@Basic
	@Column(name = "user_registered", nullable = false)
	public Timestamp getUserRegistered() {
		return userRegistered;
	}

	public void setUserRegistered(Timestamp userRegistered) {
		this.userRegistered = userRegistered;
	}

	@Basic
	@Column(name = "user_activation_key", nullable = false, length = 255)
	public String getUserActivationKey() {
		return userActivationKey;
	}

	public void setUserActivationKey(String userActivationKey) {
		this.userActivationKey = userActivationKey;
	}

	@Basic
	@Column(name = "user_status", nullable = false)
	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	@Basic
	@Column(name = "display_name", nullable = false, length = 250)
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Basic
	@Column(name = "spam", nullable = false)
	public Byte getSpam() {
		return spam;
	}

	public void setSpam(Byte spam) {
		this.spam = spam;
	}

	@Basic
	@Column(name = "deleted", nullable = false)
	public Byte getDeleted() {
		return deleted;
	}

	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpUsers wpUsers = (WpUsers) o;

		if (id != null ? !id.equals(wpUsers.id) : wpUsers.id != null) return false;
		if (userLogin != null ? !userLogin.equals(wpUsers.userLogin) : wpUsers.userLogin != null) return false;
		if (userPass != null ? !userPass.equals(wpUsers.userPass) : wpUsers.userPass != null) return false;
		if (userNicename != null ? !userNicename.equals(wpUsers.userNicename) : wpUsers.userNicename != null)
			return false;
		if (userEmail != null ? !userEmail.equals(wpUsers.userEmail) : wpUsers.userEmail != null) return false;
		if (userUrl != null ? !userUrl.equals(wpUsers.userUrl) : wpUsers.userUrl != null) return false;
		if (userRegistered != null ? !userRegistered.equals(wpUsers.userRegistered) : wpUsers.userRegistered != null)
			return false;
		if (userActivationKey != null ? !userActivationKey.equals(wpUsers.userActivationKey) : wpUsers.userActivationKey != null)
			return false;
		if (userStatus != null ? !userStatus.equals(wpUsers.userStatus) : wpUsers.userStatus != null) return false;
		if (displayName != null ? !displayName.equals(wpUsers.displayName) : wpUsers.displayName != null) return false;
		if (spam != null ? !spam.equals(wpUsers.spam) : wpUsers.spam != null) return false;
		if (deleted != null ? !deleted.equals(wpUsers.deleted) : wpUsers.deleted != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
		result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
		result = 31 * result + (userNicename != null ? userNicename.hashCode() : 0);
		result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
		result = 31 * result + (userUrl != null ? userUrl.hashCode() : 0);
		result = 31 * result + (userRegistered != null ? userRegistered.hashCode() : 0);
		result = 31 * result + (userActivationKey != null ? userActivationKey.hashCode() : 0);
		result = 31 * result + (userStatus != null ? userStatus.hashCode() : 0);
		result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
		result = 31 * result + (spam != null ? spam.hashCode() : 0);
		result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
		return result;
	}
}
