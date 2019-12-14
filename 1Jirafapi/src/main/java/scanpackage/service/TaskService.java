package scanpackage.service;

import scanpackage.models.TaskKonvert;
import scanpackage.models.TaskModel;

import java.util.List;

public interface TaskService {

    List<TaskModel> getAll();
    TaskModel save(TaskModel task);
    TaskModel findById(Integer id);

    List<TaskKonvert> findByIdInProjectConvert(Integer id);

    TaskModel deleteTask(Integer id);
    TaskModel update(TaskModel task);

    List<TaskKonvert> getTaskfotProject(Integer id);
}
