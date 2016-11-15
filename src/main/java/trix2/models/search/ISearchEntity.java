package trix2.models.search;

import trix2.models.custom.Identifiable;
import trix2.models.custom.MultiTenantEntity;

import java.io.Serializable;

public interface ISearchEntity extends Identifiable, MultiTenantEntity, Serializable {

	@Override
	Integer getId();

	String getType();
}