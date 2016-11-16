package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_links", schema = "multiwp", catalog = "")
public class WpLinks {
	private Long linkId;
	private String linkUrl;
	private String linkName;
	private String linkImage;
	private String linkTarget;
	private String linkDescription;
	private String linkVisible;
	private Long linkOwner;
	private Integer linkRating;
	private Timestamp linkUpdated;
	private String linkRel;
	private String linkNotes;
	private String linkRss;

	@Id
	@Column(name = "link_id", nullable = false)
	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	@Basic
	@Column(name = "link_url", nullable = false, length = 255)
	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	@Basic
	@Column(name = "link_name", nullable = false, length = 255)
	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	@Basic
	@Column(name = "link_image", nullable = false, length = 255)
	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	@Basic
	@Column(name = "link_target", nullable = false, length = 25)
	public String getLinkTarget() {
		return linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	@Basic
	@Column(name = "link_description", nullable = false, length = 255)
	public String getLinkDescription() {
		return linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	@Basic
	@Column(name = "link_visible", nullable = false, length = 20)
	public String getLinkVisible() {
		return linkVisible;
	}

	public void setLinkVisible(String linkVisible) {
		this.linkVisible = linkVisible;
	}

	@Basic
	@Column(name = "link_owner", nullable = false)
	public Long getLinkOwner() {
		return linkOwner;
	}

	public void setLinkOwner(Long linkOwner) {
		this.linkOwner = linkOwner;
	}

	@Basic
	@Column(name = "link_rating", nullable = false)
	public Integer getLinkRating() {
		return linkRating;
	}

	public void setLinkRating(Integer linkRating) {
		this.linkRating = linkRating;
	}

	@Basic
	@Column(name = "link_updated", nullable = false)
	public Timestamp getLinkUpdated() {
		return linkUpdated;
	}

	public void setLinkUpdated(Timestamp linkUpdated) {
		this.linkUpdated = linkUpdated;
	}

	@Basic
	@Column(name = "link_rel", nullable = false, length = 255)
	public String getLinkRel() {
		return linkRel;
	}

	public void setLinkRel(String linkRel) {
		this.linkRel = linkRel;
	}

	@Basic
	@Column(name = "link_notes", nullable = false, length = -1)
	public String getLinkNotes() {
		return linkNotes;
	}

	public void setLinkNotes(String linkNotes) {
		this.linkNotes = linkNotes;
	}

	@Basic
	@Column(name = "link_rss", nullable = false, length = 255)
	public String getLinkRss() {
		return linkRss;
	}

	public void setLinkRss(String linkRss) {
		this.linkRss = linkRss;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpLinks wpLinks = (WpLinks) o;

		if (linkId != null ? !linkId.equals(wpLinks.linkId) : wpLinks.linkId != null) return false;
		if (linkUrl != null ? !linkUrl.equals(wpLinks.linkUrl) : wpLinks.linkUrl != null) return false;
		if (linkName != null ? !linkName.equals(wpLinks.linkName) : wpLinks.linkName != null) return false;
		if (linkImage != null ? !linkImage.equals(wpLinks.linkImage) : wpLinks.linkImage != null) return false;
		if (linkTarget != null ? !linkTarget.equals(wpLinks.linkTarget) : wpLinks.linkTarget != null) return false;
		if (linkDescription != null ? !linkDescription.equals(wpLinks.linkDescription) : wpLinks.linkDescription != null)
			return false;
		if (linkVisible != null ? !linkVisible.equals(wpLinks.linkVisible) : wpLinks.linkVisible != null) return false;
		if (linkOwner != null ? !linkOwner.equals(wpLinks.linkOwner) : wpLinks.linkOwner != null) return false;
		if (linkRating != null ? !linkRating.equals(wpLinks.linkRating) : wpLinks.linkRating != null) return false;
		if (linkUpdated != null ? !linkUpdated.equals(wpLinks.linkUpdated) : wpLinks.linkUpdated != null) return false;
		if (linkRel != null ? !linkRel.equals(wpLinks.linkRel) : wpLinks.linkRel != null) return false;
		if (linkNotes != null ? !linkNotes.equals(wpLinks.linkNotes) : wpLinks.linkNotes != null) return false;
		if (linkRss != null ? !linkRss.equals(wpLinks.linkRss) : wpLinks.linkRss != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = linkId != null ? linkId.hashCode() : 0;
		result = 31 * result + (linkUrl != null ? linkUrl.hashCode() : 0);
		result = 31 * result + (linkName != null ? linkName.hashCode() : 0);
		result = 31 * result + (linkImage != null ? linkImage.hashCode() : 0);
		result = 31 * result + (linkTarget != null ? linkTarget.hashCode() : 0);
		result = 31 * result + (linkDescription != null ? linkDescription.hashCode() : 0);
		result = 31 * result + (linkVisible != null ? linkVisible.hashCode() : 0);
		result = 31 * result + (linkOwner != null ? linkOwner.hashCode() : 0);
		result = 31 * result + (linkRating != null ? linkRating.hashCode() : 0);
		result = 31 * result + (linkUpdated != null ? linkUpdated.hashCode() : 0);
		result = 31 * result + (linkRel != null ? linkRel.hashCode() : 0);
		result = 31 * result + (linkNotes != null ? linkNotes.hashCode() : 0);
		result = 31 * result + (linkRss != null ? linkRss.hashCode() : 0);
		return result;
	}
}
