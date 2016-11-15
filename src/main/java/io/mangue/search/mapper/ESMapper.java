package io.mangue.search.mapper;

import io.mangue.models.search.ISearchEntity;

public interface ESMapper<T extends ISearchEntity, K> {

	T asDto(K entity);
}
