package trix2.wordpress.models.basic;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_terms", schema = "multiwp", catalog = "")
public class WpTerms {
	private Long termId;
	private String name;
	private String slug;
	private Long termGroup;

	@Id
	@Column(name = "term_id", nullable = false)
	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	}

	@Basic
	@Column(name = "name", nullable = false, length = 200)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "slug", nullable = false, length = 200)
	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Basic
	@Column(name = "term_group", nullable = false)
	public Long getTermGroup() {
		return termGroup;
	}

	public void setTermGroup(Long termGroup) {
		this.termGroup = termGroup;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpTerms wpTerms = (WpTerms) o;

		if (termId != null ? !termId.equals(wpTerms.termId) : wpTerms.termId != null) return false;
		if (name != null ? !name.equals(wpTerms.name) : wpTerms.name != null) return false;
		if (slug != null ? !slug.equals(wpTerms.slug) : wpTerms.slug != null) return false;
		if (termGroup != null ? !termGroup.equals(wpTerms.termGroup) : wpTerms.termGroup != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = termId != null ? termId.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (slug != null ? slug.hashCode() : 0);
		result = 31 * result + (termGroup != null ? termGroup.hashCode() : 0);
		return result;
	}
}
