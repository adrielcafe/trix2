package trix2.wordpress.models.basic;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by misael on 11/15/2016.
 */
public class WpTermRelationshipsPK implements Serializable {
	private Long objectId;
	private Long termTaxonomyId;

	@Column(name = "object_id", nullable = false)
	@Id
	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	@Column(name = "term_taxonomy_id", nullable = false)
	@Id
	public Long getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpTermRelationshipsPK that = (WpTermRelationshipsPK) o;

		if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
		if (termTaxonomyId != null ? !termTaxonomyId.equals(that.termTaxonomyId) : that.termTaxonomyId != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = objectId != null ? objectId.hashCode() : 0;
		result = 31 * result + (termTaxonomyId != null ? termTaxonomyId.hashCode() : 0);
		return result;
	}
}
