package pakScan.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakScan.entity.Project;


@Repository
public interface ProjectRepositoryBeck extends CrudRepository<Project,Integer> {



}

