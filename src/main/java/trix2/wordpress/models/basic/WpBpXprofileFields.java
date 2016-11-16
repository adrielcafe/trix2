package trix2.wordpress.models.basic;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_bp_xprofile_fields", schema = "multiwp", catalog = "")
public class WpBpXprofileFields {
	private Long id;
	private Long groupId;
	private Long parentId;
	private String type;
	private String name;
	private String description;
	private Byte isRequired;
	private Byte isDefaultOption;
	private Long fieldOrder;
	private Long optionOrder;
	private String orderBy;
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
	@Column(name = "group_id", nullable = false)
	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	@Basic
	@Column(name = "parent_id", nullable = false)
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	@Basic
	@Column(name = "type", nullable = false, length = 150)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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
	@Column(name = "is_required", nullable = false)
	public Byte getIsRequired() {
		return isRequired;
	}

	public void setIsRequired(Byte isRequired) {
		this.isRequired = isRequired;
	}

	@Basic
	@Column(name = "is_default_option", nullable = false)
	public Byte getIsDefaultOption() {
		return isDefaultOption;
	}

	public void setIsDefaultOption(Byte isDefaultOption) {
		this.isDefaultOption = isDefaultOption;
	}

	@Basic
	@Column(name = "field_order", nullable = false)
	public Long getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(Long fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	@Basic
	@Column(name = "option_order", nullable = false)
	public Long getOptionOrder() {
		return optionOrder;
	}

	public void setOptionOrder(Long optionOrder) {
		this.optionOrder = optionOrder;
	}

	@Basic
	@Column(name = "order_by", nullable = false, length = 15)
	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
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

		WpBpXprofileFields that = (WpBpXprofileFields) o;

		if (id != null ? !id.equals(that.id) : that.id != null) return false;
		if (groupId != null ? !groupId.equals(that.groupId) : that.groupId != null) return false;
		if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
		if (type != null ? !type.equals(that.type) : that.type != null) return false;
		if (name != null ? !name.equals(that.name) : that.name != null) return false;
		if (description != null ? !description.equals(that.description) : that.description != null) return false;
		if (isRequired != null ? !isRequired.equals(that.isRequired) : that.isRequired != null) return false;
		if (isDefaultOption != null ? !isDefaultOption.equals(that.isDefaultOption) : that.isDefaultOption != null)
			return false;
		if (fieldOrder != null ? !fieldOrder.equals(that.fieldOrder) : that.fieldOrder != null) return false;
		if (optionOrder != null ? !optionOrder.equals(that.optionOrder) : that.optionOrder != null) return false;
		if (orderBy != null ? !orderBy.equals(that.orderBy) : that.orderBy != null) return false;
		if (canDelete != null ? !canDelete.equals(that.canDelete) : that.canDelete != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (groupId != null ? groupId.hashCode() : 0);
		result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
		result = 31 * result + (type != null ? type.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + (isRequired != null ? isRequired.hashCode() : 0);
		result = 31 * result + (isDefaultOption != null ? isDefaultOption.hashCode() : 0);
		result = 31 * result + (fieldOrder != null ? fieldOrder.hashCode() : 0);
		result = 31 * result + (optionOrder != null ? optionOrder.hashCode() : 0);
		result = 31 * result + (orderBy != null ? orderBy.hashCode() : 0);
		result = 31 * result + (canDelete != null ? canDelete.hashCode() : 0);
		return result;
	}
}
