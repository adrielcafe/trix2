package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_bp_activity", schema = "multiwp", catalog = "")
public class WpBpActivity {
	private Long id;
	private Long userId;
	private String component;
	private String type;
	private String action;
	private String content;
	private String primaryLink;
	private Long itemId;
	private Long secondaryItemId;
	private Timestamp dateRecorded;
	private Byte hideSitewide;
	private Integer mpttLeft;
	private Integer mpttRight;
	private Byte isSpam;

	@Id
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Basic
	@Column(name = "component", nullable = false, length = 75)
	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	@Basic
	@Column(name = "type", nullable = false, length = 75)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Basic
	@Column(name = "action", nullable = false, length = -1)
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Basic
	@Column(name = "content", nullable = false, length = -1)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Basic
	@Column(name = "primary_link", nullable = false, length = -1)
	public String getPrimaryLink() {
		return primaryLink;
	}

	public void setPrimaryLink(String primaryLink) {
		this.primaryLink = primaryLink;
	}

	@Basic
	@Column(name = "item_id", nullable = false)
	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@Basic
	@Column(name = "secondary_item_id", nullable = true)
	public Long getSecondaryItemId() {
		return secondaryItemId;
	}

	public void setSecondaryItemId(Long secondaryItemId) {
		this.secondaryItemId = secondaryItemId;
	}

	@Basic
	@Column(name = "date_recorded", nullable = false)
	public Timestamp getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(Timestamp dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	@Basic
	@Column(name = "hide_sitewide", nullable = true)
	public Byte getHideSitewide() {
		return hideSitewide;
	}

	public void setHideSitewide(Byte hideSitewide) {
		this.hideSitewide = hideSitewide;
	}

	@Basic
	@Column(name = "mptt_left", nullable = false)
	public Integer getMpttLeft() {
		return mpttLeft;
	}

	public void setMpttLeft(Integer mpttLeft) {
		this.mpttLeft = mpttLeft;
	}

	@Basic
	@Column(name = "mptt_right", nullable = false)
	public Integer getMpttRight() {
		return mpttRight;
	}

	public void setMpttRight(Integer mpttRight) {
		this.mpttRight = mpttRight;
	}

	@Basic
	@Column(name = "is_spam", nullable = false)
	public Byte getIsSpam() {
		return isSpam;
	}

	public void setIsSpam(Byte isSpam) {
		this.isSpam = isSpam;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBpActivity that = (WpBpActivity) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
		if (component != null ? !component.equals(that.component) : that.component != null) return false;
		if (type != null ? !type.equals(that.type) : that.type != null) return false;
		if (action != null ? !action.equals(that.action) : that.action != null) return false;
		if (content != null ? !content.equals(that.content) : that.content != null) return false;
		if (primaryLink != null ? !primaryLink.equals(that.primaryLink) : that.primaryLink != null) return false;
		if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
		if (secondaryItemId != null ? !secondaryItemId.equals(that.secondaryItemId) : that.secondaryItemId != null)
			return false;
		if (dateRecorded != null ? !dateRecorded.equals(that.dateRecorded) : that.dateRecorded != null) return false;
		if (hideSitewide != null ? !hideSitewide.equals(that.hideSitewide) : that.hideSitewide != null) return false;
		if (mpttLeft != null ? !mpttLeft.equals(that.mpttLeft) : that.mpttLeft != null) return false;
		if (mpttRight != null ? !mpttRight.equals(that.mpttRight) : that.mpttRight != null) return false;
		if (isSpam != null ? !isSpam.equals(that.isSpam) : that.isSpam != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (component != null ? component.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (action != null ? action.hashCode() : 0);
		result = 31 * result + (content != null ? content.hashCode() : 0);
		result = 31 * result + (primaryLink != null ? primaryLink.hashCode() : 0);
		result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
		result = 31 * result + (secondaryItemId != null ? secondaryItemId.hashCode() : 0);
		result = 31 * result + (dateRecorded != null ? dateRecorded.hashCode() : 0);
		result = 31 * result + (hideSitewide != null ? hideSitewide.hashCode() : 0);
		result = 31 * result + (mpttLeft != null ? mpttLeft.hashCode() : 0);
		result = 31 * result + (mpttRight != null ? mpttRight.hashCode() : 0);
		result = 31 * result + (isSpam != null ? isSpam.hashCode() : 0);
		return result;
	}
}
