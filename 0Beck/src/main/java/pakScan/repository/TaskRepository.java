package pakScan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pakScan.entity.Task;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    @Query(value = "select b.id from Task b  where b.project_task = ?1")
    List<Integer> findByIdInProject(Integer project_task);


//SELECT d FROM Employee e INNER JOIN e.department d

    @Query("select b from Task b where b.project_task = ?1")
    List<Task> findByTaskinProject(Integer name);


    @Query("select b from Task b where b.project_task = ?1")
    List<Task> getTaskforProject(Integer name);

    @Modifying
    @Transactional
    @Query(nativeQuery = true, value = "INSERT task(code,description,due,estimation,assigne," +
            " creat,updat,clos,priority_task,project_task,stories," +
            " status_task)" +
            " VALUES (code,description, due, estimation,assigne,creat" +
            "updat,clos,priority_task,project_task,stories,status_task);")
    void saveTask(@Param("code") String code,
                  @Param("description") String description,
                  @Param("due") Date due,
                  @Param("estimation") Integer estimation,
                  @Param("assigne") Integer assigne,
                  @Param("creat") Date creat,
                  @Param("updat") Date updat,
                  @Param("clos") Date clos,
                  @Param("priority_task") Integer priority_task,
                  @Param("project_task") Integer project_task,
                  @Param("stories") String stories,
                  @Param("status_task") Integer status_task);


}
