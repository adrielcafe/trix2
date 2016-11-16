package trix2.wordpress.models;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_blogs", schema = "multiwp", catalog = "")
public class WpBlogs {
	private Long blogId;
	private Long siteId;
	private String domain;
	private String path;
	private Timestamp registered;
	private Timestamp lastUpdated;
	private Byte isPublic;
	private Byte archived;
	private Byte mature;
	private Byte spam;
	private Byte deleted;
	private Integer langId;

	@Id
	@Column(name = "blog_id", nullable = false)
	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	@Basic
	@Column(name = "site_id", nullable = false)
	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
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
	@Column(name = "registered", nullable = false)
	public Timestamp getRegistered() {
		return registered;
	}

	public void setRegistered(Timestamp registered) {
		this.registered = registered;
	}

	@Basic
	@Column(name = "last_updated", nullable = false)
	public Timestamp getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Basic
	@Column(name = "public", nullable = false)
	public Byte getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Byte isPublic) {
		this.isPublic = isPublic;
	}

	@Basic
	@Column(name = "archived", nullable = false)
	public Byte getArchived() {
		return archived;
	}

	public void setArchived(Byte archived) {
		this.archived = archived;
	}

	@Basic
	@Column(name = "mature", nullable = false)
	public Byte getMature() {
		return mature;
	}

	public void setMature(Byte mature) {
		this.mature = mature;
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

	@Basic
	@Column(name = "lang_id", nullable = false)
	public Integer getLangId() {
		return langId;
	}

	public void setLangId(Integer langId) {
		this.langId = langId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBlogs wpBlogs = (WpBlogs) o;

		if (blogId != null ? !blogId.equals(wpBlogs.blogId) : wpBlogs.blogId != null) return false;
		if (siteId != null ? !siteId.equals(wpBlogs.siteId) : wpBlogs.siteId != null) return false;
		if (domain != null ? !domain.equals(wpBlogs.domain) : wpBlogs.domain != null) return false;
		if (path != null ? !path.equals(wpBlogs.path) : wpBlogs.path != null) return false;
		if (registered != null ? !registered.equals(wpBlogs.registered) : wpBlogs.registered != null) return false;
		if (lastUpdated != null ? !lastUpdated.equals(wpBlogs.lastUpdated) : wpBlogs.lastUpdated != null) return false;
		if (isPublic != null ? !isPublic.equals(wpBlogs.isPublic) : wpBlogs.isPublic != null) return false;
		if (archived != null ? !archived.equals(wpBlogs.archived) : wpBlogs.archived != null) return false;
		if (mature != null ? !mature.equals(wpBlogs.mature) : wpBlogs.mature != null) return false;
		if (spam != null ? !spam.equals(wpBlogs.spam) : wpBlogs.spam != null) return false;
		if (deleted != null ? !deleted.equals(wpBlogs.deleted) : wpBlogs.deleted != null) return false;
		if (langId != null ? !langId.equals(wpBlogs.langId) : wpBlogs.langId != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = blogId != null ? blogId.hashCode() : 0;
		result = 31 * result + (siteId != null ? siteId.hashCode() : 0);
		result = 31 * result + (domain != null ? domain.hashCode() : 0);
		result = 31 * result + (path != null ? path.hashCode() : 0);
		result = 31 * result + (registered != null ? registered.hashCode() : 0);
		result = 31 * result + (lastUpdated != null ? lastUpdated.hashCode() : 0);
		result = 31 * result + (isPublic != null ? isPublic.hashCode() : 0);
		result = 31 * result + (archived != null ? archived.hashCode() : 0);
		result = 31 * result + (mature != null ? mature.hashCode() : 0);
		result = 31 * result + (spam != null ? spam.hashCode() : 0);
		result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
		result = 31 * result + (langId != null ? langId.hashCode() : 0);
		return result;
	}
}
