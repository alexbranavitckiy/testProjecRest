package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Status;
import pakScan.entity.Task;
import pakScan.repository.TaskRepositoryBeck;
import pakScan.service.TaskServiceBeck;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImplBeck implements TaskServiceBeck {

    @Autowired
    TaskRepositoryBeck taskRepository;


    @Override
    public Task addTask(Task task) {
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
