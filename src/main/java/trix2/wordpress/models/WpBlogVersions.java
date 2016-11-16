package trix2.wordpress.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_blog_versions", schema = "multiwp", catalog = "")
public class WpBlogVersions {
	private Long blogId;
	private String dbVersion;
	private Timestamp lastUpdated;

	@Id
	@Column(name = "blog_id", nullable = false)
	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	@Basic
	@Column(name = "db_version", nullable = false, length = 20)
	public String getDbVersion() {
		return dbVersion;
	}

	public void setDbVersion(String dbVersion) {
		this.dbVersion = dbVersion;
	}

	@Basic
	@Column(name = "last_updated", nullable = false)
	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBlogVersions that = (WpBlogVersions) o;

		if (blogId != null ? !blogId.equals(that.blogId) : that.blogId != null) return false;
		if (dbVersion != null ? !dbVersion.equals(that.dbVersion) : that.dbVersion != null) return false;
		if (lastUpdated != null ? !lastUpdated.equals(that.lastUpdated) : that.lastUpdated != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = blogId != null ? blogId.hashCode() : 0;
		result = 31 * result + (dbVersion != null ? dbVersion.hashCode() : 0);
		result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
		return result;
	}
}
