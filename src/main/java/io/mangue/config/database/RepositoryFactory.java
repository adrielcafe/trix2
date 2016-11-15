package io.mangue.config.database;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.core.RepositoryInformation;
import org.springframework.data.repository.core.RepositoryMetadata;

import javax.persistence.EntityManager;

public class RepositoryFactory extends JpaRepositoryFactory {

	private EntityManager entityManager;

	public RepositoryFactory(EntityManager entityManager) {
		super(entityManager);
		this.entityManager = entityManager;
	}

	@Override
	public Object getTargetRepository(RepositoryInformation information) {
		return getTargetRepository(information, entityManager);
	}

	@Override
	public SimpleJpaRepository<?, ?> getTargetRepository(RepositoryInformation information, EntityManager entityManager) {
//		if (Post.class.isAssignableFrom(metadata.getDomainType())) {
//			return new JpaMultiTenantRepository(getEntityInformation((Class<Post>) metadata.getDomainType()), entityManager);
//		} else {
			return super.getTargetRepository(information, entityManager);
//		}
	}

	@Override
	public Class<?> getRepositoryBaseClass(final RepositoryMetadata metadata) {
//		if (Post.class.isAssignableFrom(metadata.getDomainType())) {
//			return JpaMultiTenantRepository.class;
//		} else {
			return super.getRepositoryBaseClass(metadata);
//		}
	}

}