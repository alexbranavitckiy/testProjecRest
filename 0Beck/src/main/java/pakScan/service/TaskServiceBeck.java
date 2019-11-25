package pakScan.service;


import pakScan.entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskServiceBeck {
    Task addTask(Task task);
    Optional<Task> findById(Integer id);
    List<Task> getAll();
 //   void deleteTask(Integer id);
 //   Task update(Task task);
   // Page<Task> getAllInPage(Pageable pageable);
 //   List<Task> getAllByAssignee(Integer id);
 //   List<Task> getAllByReporter(Integer id);
  //  List<Task> getAllTesting();
}
