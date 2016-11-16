package trix2.wordpress.models;

import javax.persistence.*;

/**
 * Created by misael on 11/15/2016.
 */
@Entity
@Table(name = "wp_options", schema = "multiwp", catalog = "")
public class WpOptions {
	private Long optionId;
	private String optionName;
	private String optionValue;
	private String autoload;

	@Id
	@Column(name = "option_id", nullable = false)
	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	@Basic
	@Column(name = "option_name", nullable = false, length = 191)
	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	@Basic
	@Column(name = "option_value", nullable = false, length = -1)
	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	@Basic
	@Column(name = "autoload", nullable = false, length = 20)
	public String getAutoload() {
		return autoload;
	}

	public void setAutoload(String autoload) {
		this.autoload = autoload;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		WpOptions wpOptions = (WpOptions) o;

		if (optionId != null ? !optionId.equals(wpOptions.optionId) : wpOptions.optionId != null) return false;
		if (optionName != null ? !optionName.equals(wpOptions.optionName) : wpOptions.optionName != null) return false;
		if (optionValue != null ? !optionValue.equals(wpOptions.optionValue) : wpOptions.optionValue != null)
			return false;
		if (autoload != null ? !autoload.equals(wpOptions.autoload) : wpOptions.autoload != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = optionId != null ? optionId.hashCode() : 0;
		result = 31 * result + (optionName != null ? optionName.hashCode() : 0);
		result = 31 * result + (optionValue != null ? optionValue.hashCode() : 0);
		result = 31 * result + (autoload != null ? autoload.hashCode() : 0);
		return result;
	}
}
