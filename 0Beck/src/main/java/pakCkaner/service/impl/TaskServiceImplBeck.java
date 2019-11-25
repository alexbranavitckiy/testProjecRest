package pakCkaner.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakCkaner.entity.Status;
import pakCkaner.entity.Task;
import pakCkaner.repository.TaskRepositoryBeck;
import pakCkaner.service.TaskServiceBeck;

import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class TaskServiceImplBeck implements TaskServiceBeck {

    @Autowired
    TaskRepositoryBeck taskRepository;


    @Override
    public Task addTask(Task task) {
       // task.setCreat(new Date());
        Status status = new Status();
       // status.setIdStatus(1);
        //        task.setStatus(status);
        //        task.setCodtas(task.getProject() + "-" + (1));
        Task newTask = taskRepository.save(task);
        return newTask;
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
