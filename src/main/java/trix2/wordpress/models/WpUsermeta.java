package trix2.wordpress.models;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_usermeta", schema = "multiwp", catalog = "")
public class WpUsermeta {
	private Long umetaId;
	private Long userId;
	private String metaKey;
	private String metaValue;

	@Id
	@Column(name = "umeta_id", nullable = false)
	public Long getUmetaId() {
		return umetaId;
	}

	public void setUmetaId(Long umetaId) {
		this.umetaId = umetaId;
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

		WpUsermeta that = (WpUsermeta) o;

		if (umetaId != null ? !umetaId.equals(that.umetaId) : that.umetaId != null) return false;
		if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
		if (metaKey != null ? !metaKey.equals(that.metaKey) : that.metaKey != null) return false;
		if (metaValue != null ? !metaValue.equals(that.metaValue) : that.metaValue != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = umetaId != null ? umetaId.hashCode() : 0;
		result = 31 * result + (userId != null ? userId.hashCode() : 0);
		result = 31 * result + (metaKey != null ? metaKey.hashCode() : 0);
		result = 31 * result + (metaValue != null ? metaValue.hashCode() : 0);
		return result;
	}
}
