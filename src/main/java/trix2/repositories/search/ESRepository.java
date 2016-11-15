package trix2.repositories.search;

import trix2.models.search.ISearchEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@NoRepositoryBean
@RepositoryRestResource(exported = false)
public interface ESRepository<T extends ISearchEntity> extends ElasticsearchRepository<T, Integer> {

//	@Override
//	<S extends T> S save(S entity);
}