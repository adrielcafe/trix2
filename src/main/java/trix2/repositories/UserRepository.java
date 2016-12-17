package trix2.repositories;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import trix2.models.User;

/**
 * Created by misael on 12/15/2016.
 */
@RepositoryRestResource(exported = true)
public interface UserRepository extends JpaRepository<User, Integer>, QueryDslPredicateExecutor<User>{

	@RestResource(exported = false)
	@Cacheable(value = "user", key = "#p0")
	@Query("select user from User user where user.username = :username")
	User findByUsername(@Param("username") String username);
}
