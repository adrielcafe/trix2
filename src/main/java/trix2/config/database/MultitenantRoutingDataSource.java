//package trix2.config.database;
//
//		import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//		import trix2.config.multitenance.TenantContextHolder;
//
//public class MultitenantRoutingDataSource extends AbstractRoutingDataSource {
//	@Override
//	protected Object determineCurrentLookupKey() {
//		return TenantContextHolder.getTenantSubdomain();
//	}
//}