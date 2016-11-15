package io.mangue.search;

import io.mangue.models.search.ISearchEntity;
import io.mangue.repositories.search.ESRepository;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.support.AbstractElasticsearchRepository;
import org.springframework.data.elasticsearch.repository.support.ElasticsearchEntityInformation;
import org.springframework.stereotype.Component;

@Component
public class ESRepositoryImpl<T extends ISearchEntity>
		extends AbstractElasticsearchRepository<T, Integer> implements ESRepository<T> {

	public ESRepositoryImpl() {
	}

	public ESRepositoryImpl(ElasticsearchOperations elasticsearchOperations) {
		super(elasticsearchOperations);
	}

	public ESRepositoryImpl(ElasticsearchEntityInformation<T, Integer> metadata, ElasticsearchOperations elasticsearchOperations) {
		super(metadata, elasticsearchOperations);
	}

	@Override
	protected String stringIdRepresentation(Integer id) {
		return id.toString();
	}

//	@Override
//	public <S extends T> S save(S entity) {
//		Assert.notNull(entity, "Cannot save 'null' entity.");
//		elasticsearchOperations.index(createIndexQuery(entity));
//		elasticsearchOperations.refresh(entity.getTenantSubdomain(), true);
//		return entity;
//	}
//
//	public void delete(Integer id) {
//		T t = this.findOne(id);
//		this.delete(t);
//	}

//	private IndexQuery createIndexQuery(T entity) {
//		return new IndexQueryBuilder()
//				.withObject(entity)
//				.withId(stringIdRepresentation(entity.getId()))
//				.withType(entity.getType())
//				.withIndexName(entity.getTenantSubdomain())
//				.build();
//	}
}
