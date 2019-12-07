package pakScan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pakScan.entity.Task;
import pakScan.service.TaskService;

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
        System.out.println(task.toString());
        return taskService.addTask(task);
    }


}
