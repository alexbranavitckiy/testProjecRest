package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Task;
import pakScan.repository.TaskRepository;
import pakScan.service.TaskService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public Task addTask(Task task) {

        task.setClos(new Date());
        task.setCreat(new Date());
        task.setDue(new Date());
        System.out.println(task.toString());
        Task newTask = taskRepository.save(task);
        System.out.println(task.toString());

        //  TaskKonvert newTask = taskKonvertRepositoryBeck.save(task);
        return null;//newTask;
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
