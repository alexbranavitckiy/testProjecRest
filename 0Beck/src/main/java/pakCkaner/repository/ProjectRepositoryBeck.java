package pakCkaner.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakCkaner.entity.Project;


@Repository
public interface ProjectRepositoryBeck extends CrudRepository<Project,Integer> {



}

