package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Task;
import pakScan.entity.TaskConvert;
import pakScan.repository.ProjectRepository;
import pakScan.repository.TaskConvertRepository;
import pakScan.repository.TaskRepository;
import pakScan.service.TaskService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;
    private TaskConvertRepository taskConvertRepository;
    private ProjectRepository projectRepository;


    @Autowired
    public TaskServiceImpl(ProjectRepository projectRepository, TaskRepository taskRepository, TaskConvertRepository taskConvertRepository) {
        this.taskConvertRepository = taskConvertRepository;
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public List<TaskConvert> getTaskforProject(Integer name) {

        //   System.out.println(taskConvertRepository.getTaskforProject(name));
        return null;
    }

    @Override
    public List<TaskConvert> findByIdInProject(Integer name) {
        List list = new ArrayList<TaskConvert>();

        //  List<Integer> arrayList= taskRepository.findByIdInProject(name);
        list = taskConvertRepository.findAllByInProject(name);
        System.out.println(list.toArray() + "List7777" + "name" + name);

        return list;
    }


    @Override
    public void deleteTask(Integer id) {
        taskRepository.deleteById(id);
    }

//@Override
//public TaskConvert addTask(TaskConvert task) {
//    task.setClos(new Date());
//    task.setCreat(new Date());
//    task.setDue(new Date());
//    System.out.println(task);
//    taskConvertRepository.saveTask(task.getCode(),
//            task.getDescription(),task.getDue(),
//            task.getEstimation(),task.getAssigne().getId(),
//            task.getCreat(),task.getUpdat(),task.getClos(),
//            task.getPriority_task().getId(),
//            task.getProject_task().getId(),
//            task.getStories(),
//            task.getStatus_task().getId());
//    return null;
//}


    @Override
    public Task addTask(Task task) {
        task.setClos(new Date());
        task.setCreat(new Date());
        task.setDue(new Date());

        System.out.println(task);
        return taskRepository.save(task);
    }


    @Override
    public Optional<Task> findById(Integer id) {
        return taskRepository.findById(id);
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll();
    }


}
