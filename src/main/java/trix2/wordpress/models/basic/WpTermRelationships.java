package trix2.wordpress.models.basic;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_term_relationships", schema = "multiwp", catalog = "")
@IdClass(WpTermRelationshipsPK.class)
public class WpTermRelationships {
	private Long objectId;
	private Long termTaxonomyId;
	private Integer termOrder;

	@Id
	@Column(name = "object_id", nullable = false)
	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	@Id
	@Column(name = "term_taxonomy_id", nullable = false)
	public Long getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	@Basic
	@Column(name = "term_order", nullable = false)
	public Integer getTermOrder() {
		return termOrder;
	}

	public void setTermOrder(Integer termOrder) {
		this.termOrder = termOrder;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpTermRelationships that = (WpTermRelationships) o;

		if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
		if (termTaxonomyId != null ? !termTaxonomyId.equals(that.termTaxonomyId) : that.termTaxonomyId != null)
			return false;
		if (termOrder != null ? !termOrder.equals(that.termOrder) : that.termOrder != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = objectId != null ? objectId.hashCode() : 0;
		result = 31 * result + (termTaxonomyId != null ? termTaxonomyId.hashCode() : 0);
		result = 31 * result + (termOrder != null ? termOrder.hashCode() : 0);
		return result;
	}
}
