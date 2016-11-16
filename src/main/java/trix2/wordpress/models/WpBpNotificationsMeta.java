package trix2.wordpress.models;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_bp_notifications_meta", schema = "multiwp", catalog = "")
public class WpBpNotificationsMeta {
	private Long id;
	private Long notificationId;
	private String metaKey;
	private String metaValue;

	@Id
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "notification_id", nullable = false)
	public Long getNotificationId() {
		return notificationId;
	}

	public void setNotificationId(Long notificationId) {
		this.notificationId = notificationId;
	}

	@Basic
	@Column(name = "meta_key", nullable = true, length = 255)
	public String getMetaKey() {
		return metaKey;
	}

	public void setMetaKey(String metaKey) {
		this.metaKey = metaKey;
	}

	@Basic
	@Column(name = "meta_value", nullable = true, length = -1)
	public String getMetaValue() {
		return metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBpNotificationsMeta that = (WpBpNotificationsMeta) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (notificationId != null ? !notificationId.equals(that.notificationId) : that.notificationId != null)
			return false;
		if (metaKey != null ? !metaKey.equals(that.metaKey) : that.metaKey != null) return false;
		if (metaValue != null ? !metaValue.equals(that.metaValue) : that.metaValue != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (notificationId != null ? notificationId.hashCode() : 0);
		result = 31 * result + (metaKey != null ? metaKey.hashCode() : 0);
		result = 31 * result + (metaValue != null ? metaValue.hashCode() : 0);
		return result;
	}
}
