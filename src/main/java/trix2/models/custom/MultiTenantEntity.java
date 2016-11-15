package trix2.models.custom;

public interface MultiTenantEntity {

	String getTenantSubdomain();

	void setTenantSubdomain(String tenantSubdomain);
}