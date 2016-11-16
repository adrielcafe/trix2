package trix2.wordpress.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_registration_log", schema = "multiwp", catalog = "")
public class WpRegistrationLog {
	private Long id;
	private String email;
	private String ip;
	private Long blogId;
	private Timestamp dateRegistered;

	@Id
	@Column(name = "ID", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "email", nullable = false, length = 255)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Basic
	@Column(name = "IP", nullable = false, length = 30)
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Basic
	@Column(name = "blog_id", nullable = false)
	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	@Basic
	@Column(name = "date_registered", nullable = false)
	public Timestamp getDateRegistered() {
		return dateRegistered;
	}

	public void setDateRegistered(Timestamp dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpRegistrationLog that = (WpRegistrationLog) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (email != null ? !email.equals(that.email) : that.email != null) return false;
		if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
		if (blogId != null ? !blogId.equals(that.blogId) : that.blogId != null) return false;
		if (dateRegistered != null ? !dateRegistered.equals(that.dateRegistered) : that.dateRegistered != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (ip != null ? ip.hashCode() : 0);
		result = 31 * result + (blogId != null ? blogId.hashCode() : 0);
		result = 31 * result + (dateRegistered != null ? dateRegistered.hashCode() : 0);
		return result;
	}
}
