package trix2.config.database;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;
import trix2.config.multitenance.TenantContextHolder;

@Component
public class CurrentTenantResolverImpl implements CurrentTenantIdentifierResolver {
	@Override
    public String resolveCurrentTenantIdentifier() {
        String tenant = TenantContextHolder.getTenantSubdomain();
        return tenant == null ? "trix2" : tenant;
    }
 
    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}