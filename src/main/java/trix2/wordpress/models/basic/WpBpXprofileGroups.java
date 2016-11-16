package trix2.wordpress.models.basic;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_bp_xprofile_groups", schema = "multiwp", catalog = "")
public class WpBpXprofileGroups {
	private Long id;
	private String name;
	private String description;
	private Long groupOrder;
	private Byte canDelete;

	@Id
	@Column(name = "id", nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Basic
	@Column(name = "name", nullable = false, length = 150)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(name = "description", nullable = false, length = -1)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name = "group_order", nullable = false)
	public Long getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(Long groupOrder) {
		this.groupOrder = groupOrder;
	}

	@Basic
	@Column(name = "can_delete", nullable = false)
	public Byte getCanDelete() {
		return canDelete;
	}

	public void setCanDelete(Byte canDelete) {
		this.canDelete = canDelete;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpBpXprofileGroups that = (WpBpXprofileGroups) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (groupOrder != null ? !groupOrder.equals(that.groupOrder) : that.groupOrder != null) return false;
		if (canDelete != null ? !canDelete.equals(that.canDelete) : that.canDelete != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (groupOrder != null ? groupOrder.hashCode() : 0);
		result = 31 * result + (canDelete != null ? canDelete.hashCode() : 0);
		return result;
	}
}
