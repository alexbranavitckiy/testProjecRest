package pakScan.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pakScan.entity.Project;

import java.util.List;


@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {


    @Query(value = "select b from Project b where (b.name like concat('%', :name, '%'))")
    List<Project> findByName(@Param("name") String name);

}

