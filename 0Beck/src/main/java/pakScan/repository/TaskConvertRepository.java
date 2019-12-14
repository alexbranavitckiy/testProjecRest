package pakScan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pakScan.entity.TaskConvert;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Repository
public interface TaskConvertRepository extends JpaRepository<TaskConvert, Integer> {

// @Query(nativeQuery = true, value = "select m from Mission join m.user u where name =:name")
//    public List<Mission> findByname(@Param("name") String name);
//SELECT d FROM Employee e INNER JOIN e.department d

/////////////////////////
//    @Query(value = "select u from TaskConvert u  where u.project_task.id=:idP")
//    List<TaskConvert> findAllByInProject(@Param("idP") Integer idP);
//////////////////////////

    @Query(nativeQuery = true, value = "select task.id ,task.code,task.description,task.due,task.estimation,task.assigne," +
            " task.creat,task.updat,task.clos,task.priority_task,task.project_task,task.stories " +
            " from task where task.project_task=:name")
    List<TaskConvert> findAllByInProject(@Param("name") Integer name);

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


//INSERT INTO `jira`.`task` (`id`, `description`, `due`, `estimation`, `assigne`, `creat`, `updat`, `clos`, `priority_task`, `project_task`, `stories`, `status_task`, `code`) VALUES ('4', '2', '2019-12-13', '2', '2', '2019-12-13', '2019-12-13', '2019-12-13', '1', '1', '1', '1', '1');


//findByFirstNameAndLastName
    //  Optional<TaskConvert> findAllByProject_task();
//    @Query(value = "select  b  from TaskConvert b where b.project_task.idproject=:idP")
//    public  Optional<TaskConvert> findByIdInProject(@Param("idP")Integer idP);


    //  @Modifying
    //    @Transactional
    //     @Query(nativeQuery = true, value = "INSERT task(id,code,description,due,estimation,assigne," +
    //                                       " creat,updat,clos,priority_task,project_task,stories," +
    //                                        " status_task)" +
    //                                       " VALUES (5,12,12, 2019-12-13, 12,1,2019-12-13" +
    //                                         "2019-12-13,2019-12-13,1,2,1,1);")
    //    void saveTask(@Param("code")String code,
    //                               @Param("description")String description,
    //                               @Param("due") Date due,
    //                               @Param("estimation")Integer estimation,
    //                               @Param("assigne")Integer assigne,
    //                               @Param("creat")Date creat,
    //                               @Param("updat")Date updat,
    //                               @Param("clos")Date clos,
    //                               @Param("priority_task")Integer priority_task,
    //                               @Param("project_task")Integer project_task,
    //                               @Param("stories")String stories,
    //                               @Param("status_task")Integer status_task);
}
