package io.mangue.models.search;

import io.mangue.models.custom.Identifiable;
import io.mangue.models.custom.MultiTenantEntity;

import java.io.Serializable;

public interface ISearchEntity extends Identifiable, MultiTenantEntity, Serializable {

	@Override
	Integer getId();

	String getType();
}