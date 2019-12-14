package pakScan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pakScan.entity.Task;
import pakScan.entity.TaskConvert;
import pakScan.service.TaskService;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {


    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = "/{id}")
    public Task findTaskById(@PathVariable(name = "id") Integer id) {
        return taskService.findById(id).get();
    }

    @GetMapping(value = "/all")
    public Iterable<Task> getAll() {

        return taskService.getAll();
    }


    @PostMapping
    public Task newTask(@RequestBody Task task) {
        System.out.println(task);
        return taskService.addTask(task);
    }


    @GetMapping(value = "/deleteTask/{id}")
    public Task deleteTask(@PathVariable(name = "id") Integer id) {
        taskService.deleteTask(id);
        return null;
    }


    @GetMapping(value = "/inProjectConvert/{id}")
    public List<TaskConvert> findByinProjectConvert(@PathVariable(name = "id") Integer id) {
        return taskService.findByIdInProject(id);
    }
}
