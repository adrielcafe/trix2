package trix2.wordpress.models.basic;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_bp_notifications", schema = "multiwp", catalog = "")
public class WpBpNotifications {
	private Long id;
	private Long userId;
	private Long itemId;
	private Long secondaryItemId;
	private String componentName;
	private String componentAction;
	private Timestamp dateNotified;
	private Byte isNew;

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
	@Column(name = "component_name", nullable = false, length = 75)
	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	@Basic
	@Column(name = "component_action", nullable = false, length = 75)
	public String getComponentAction() {
		return componentAction;
	}

	public void setComponentAction(String componentAction) {
		this.componentAction = componentAction;
	}

	@Basic
	@Column(name = "date_notified", nullable = false)
	public Timestamp getDateNotified() {
		return dateNotified;
	}

	public void setDateNotified(Timestamp dateNotified) {
		this.dateNotified = dateNotified;
	}

	@Basic
	@Column(name = "is_new", nullable = false)
	public Byte getIsNew() {
		return isNew;
	}

	public void setIsNew(Byte isNew) {
		this.isNew = isNew;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBpNotifications that = (WpBpNotifications) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
		if (itemId != null ? !itemId.equals(that.itemId) : that.itemId != null) return false;
		if (secondaryItemId != null ? !secondaryItemId.equals(that.secondaryItemId) : that.secondaryItemId != null)
			return false;
		if (componentName != null ? !componentName.equals(that.componentName) : that.componentName != null)
			return false;
		if (componentAction != null ? !componentAction.equals(that.componentAction) : that.componentAction != null)
			return false;
		if (dateNotified != null ? !dateNotified.equals(that.dateNotified) : that.dateNotified != null) return false;
		if (isNew != null ? !isNew.equals(that.isNew) : that.isNew != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (itemId != null ? itemId.hashCode() : 0);
		result = 31 * result + (secondaryItemId != null ? secondaryItemId.hashCode() : 0);
		result = 31 * result + (componentName != null ? componentName.hashCode() : 0);
		result = 31 * result + (componentAction != null ? componentAction.hashCode() : 0);
		result = 31 * result + (dateNotified != null ? dateNotified.hashCode() : 0);
		result = 31 * result + (isNew != null ? isNew.hashCode() : 0);
		return result;
	}
}
