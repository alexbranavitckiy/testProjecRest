package scanpackage.models;

import org.springframework.stereotype.Component;

@Component
public class Convector {




 public TaskModel convert(TaskKonvert taskKonvert){

     TaskModel taskModel=new TaskModel();
     taskModel.setDescription(taskKonvert.getDescription());
     taskModel.setStatus_task(taskKonvert.getStatus_task().getId());
     taskModel.setAssigne(taskKonvert.getAssigne().getId());
     taskModel.setCode(taskKonvert.getProject_task().getName() + taskKonvert.getEstimation());
     taskModel.setEstimation(taskKonvert.getEstimation());
     taskModel.setPriority_task(taskKonvert.getPriority_task().getId());
     taskModel.setDue(taskKonvert.getDue());
     taskModel.setCreateDate(taskKonvert.getCreateDate());
     taskModel.setClosedDate(taskKonvert.getClosedDate());
     taskModel.setUpdateDate(taskKonvert.getUpdateDate());
     taskModel.setStories(taskKonvert.getStories());
     taskModel.setProject_task(taskKonvert.getProject_task().getId());

     return taskModel;

    }


}
