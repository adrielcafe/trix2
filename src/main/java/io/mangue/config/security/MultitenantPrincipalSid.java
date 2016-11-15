package io.mangue.config.security;

import io.mangue.models.custom.MultiTenantEntity;
import org.springframework.security.acls.domain.PrincipalSid;
import org.springframework.security.core.Authentication;

public class MultitenantPrincipalSid extends PrincipalSid implements MultiTenantEntity {

	private static final long serialVersionUID = -1010954518074773950L;

	private String tenantSubdomain;


	public MultitenantPrincipalSid(String principal, String tenantSubdomain) {
		super(principal);
		this.tenantSubdomain = tenantSubdomain;
	}

	public MultitenantPrincipalSid(Authentication authentication, String tenantSubdomain) {
		super(authentication);
		this.tenantSubdomain = tenantSubdomain;
	}

	@Override
	public String getTenantSubdomain() {
		return tenantSubdomain;
	}

	@Override
	public void setTenantSubdomain(String tenantSubdomain) {
		this.tenantSubdomain = tenantSubdomain;
	}

	@Override
	public boolean equals(Object object) {
		if ((object == null) || !(object instanceof PrincipalSid)) {
			return false;
		}

		// Delegate to getPrincipal() to perform actual comparison (both should be
		// identical)
		return ((PrincipalSid) object).getPrincipal().equals(this.getPrincipal());
	}
}
