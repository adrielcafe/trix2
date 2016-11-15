package io.mangue.models.custom;

public interface MultiTenantEntity {

	String getTenantSubdomain();

	void setTenantSubdomain(String tenantSubdomain);
}