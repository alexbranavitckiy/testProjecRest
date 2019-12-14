package pakScan.service;


import pakScan.entity.Task;
import pakScan.entity.TaskConvert;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task addTask(Task task);

    List<Task> getAll();

    Optional<Task> findById(Integer id);

    List<TaskConvert> findByIdInProject(Integer id);

    List<TaskConvert> getTaskforProject(Integer id);

    void deleteTask(Integer id);

}
