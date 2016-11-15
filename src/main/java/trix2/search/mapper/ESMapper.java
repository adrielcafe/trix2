package trix2.search.mapper;

import trix2.models.search.ISearchEntity;

public interface ESMapper<T extends ISearchEntity, K> {

	T asDto(K entity);
}
