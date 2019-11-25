package pakCkaner.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pakCkaner.entity.Task;

@Repository
public interface TaskRepositoryBeck extends JpaRepository<Task,Integer> {

   // List<Task> findTasksByAssigneIdUsers(long id);
    //    List<Task> findTasksByReporterIdUsers(long id);
    //    List<Task> findTasksByStatusIdStatus(long id);
    //
    //    Long countTaskByProjectIdProject(long idProject);
}
