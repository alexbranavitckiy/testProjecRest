package scanpackage.service;

import scanpackage.models.TaskModel;

import java.util.List;

public interface TaskService {
    List<TaskModel> getAll();

    TaskModel findById(Integer id);

    TaskModel save(TaskModel task);

    TaskModel update(TaskModel task);

}
