package scanpackage.service;

import scanpackage.models.TaskKonvert;
import scanpackage.models.TaskModel;

import java.util.List;

public interface TaskService {

    List<TaskKonvert> getAll();

    TaskModel findById(Integer id);

    TaskModel save(TaskKonvert task);

    TaskModel update(TaskModel task);
}
