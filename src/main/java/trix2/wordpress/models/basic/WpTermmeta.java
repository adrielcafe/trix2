package trix2.wordpress.models.basic;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_termmeta", schema = "multiwp", catalog = "")
public class WpTermmeta {
	private Long metaId;
	private Long termId;
	private String metaKey;
	private String metaValue;

	@Id
	@Column(name = "meta_id", nullable = false)
	public Long getMetaId() {
		return metaId;
	}

	public void setMetaId(Long metaId) {
		this.metaId = metaId;
	}

	@Basic
	@Column(name = "term_id", nullable = false)
	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
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

		WpTermmeta that = (WpTermmeta) o;

		if (metaId != null ? !metaId.equals(that.metaId) : that.metaId != null) return false;
		if (termId != null ? !termId.equals(that.termId) : that.termId != null) return false;
		if (metaKey != null ? !metaKey.equals(that.metaKey) : that.metaKey != null) return false;
		if (metaValue != null ? !metaValue.equals(that.metaValue) : that.metaValue != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = metaId != null ? metaId.hashCode() : 0;
		result = 31 * result + (termId != null ? termId.hashCode() : 0);
		result = 31 * result + (metaKey != null ? metaKey.hashCode() : 0);
		result = 31 * result + (metaValue != null ? metaValue.hashCode() : 0);
		return result;
	}
}
