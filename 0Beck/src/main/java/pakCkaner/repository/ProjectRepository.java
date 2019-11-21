package pakCkaner.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakCkaner.entity.Project;

import java.util.Collection;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {


 //   @Query(
    //            value = "SELECT idProject,Summary,NameProject FROM jiraproject.project",
    //            nativeQuery = true)
    //    Collection<Project> aLLySER();

//SELECT idProject,Summary,NameProject FROM jiraproject.project;



}

