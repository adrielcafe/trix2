package io.mangue.config.multitenance;

//@Component
//@Scope(value = "session")
public class SessionTenantProvider implements TenantProvider {

	private String tenantSubdomain;

	@Override
	public String getTenantSubdomain() {
		return tenantSubdomain;
	}

//	@Override
//	public void setTenantSubdomain(String tenantSubdomain) {
//		this.tenantSubdomain = tenantSubdomain;
//	}
}
