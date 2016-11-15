package io.mangue.config.multitenance;

public class TenantContextHolder {

	private static final ThreadLocal<String> appId = new ThreadLocal<String>();
    private static final ThreadLocal<String> subdomain = new ThreadLocal<String>();
    private static final ThreadLocal<String> uniqueSimpleHash = new ThreadLocal<String>();
    private static final ThreadLocal<Boolean> consoleRequest = new ThreadLocal<Boolean>();
    private static final ThreadLocal<Boolean> appApiRequest = new ThreadLocal<Boolean>();

	public static String getTenantSubdomain() {
		return subdomain.get();
	}


	public static void setTenantSubdomain(String tenantSubdomain) {
		subdomain.set(tenantSubdomain);
	}

}