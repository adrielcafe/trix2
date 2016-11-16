package trix2.wordpress.models;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_site", schema = "multiwp", catalog = "")
public class WpSite {
	private Long id;
	private String domain;
	private String path;

	@Id
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpSite wpSite = (WpSite) o;

		if (id != null ? !id.equals(wpSite.id) : wpSite.id != null) return false;
		if (domain != null ? !domain.equals(wpSite.domain) : wpSite.domain != null) return false;
		if (path != null ? !path.equals(wpSite.path) : wpSite.path != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (domain != null ? domain.hashCode() : 0);
		result = 31 * result + (path != null ? path.hashCode() : 0);
		return result;
	}
}
