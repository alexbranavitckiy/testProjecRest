package scanpackage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.TaskKonvert;
import scanpackage.models.TaskModel;
import scanpackage.service.TaskService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/task")
public class TaskController {

    private TaskService taskService;


    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity getAllTask() {
        return ResponseEntity.ok(taskService.getAll());
    }


    //  getAllStatus(): Observable<Status[]> {return this.http.get<Status[]>('api/status/all');}

    @GetMapping(value = "status/{id}")
    public ResponseEntity<TaskModel> findTaskById(@PathVariable(name = "id") Integer id) {
        TaskModel task = taskService.findById(id);
        return ResponseEntity.ok(task);
    }


    @PostMapping(value = "saveTask")
    public ResponseEntity<TaskModel> saveTask(@RequestBody TaskKonvert task) {
        TaskKonvert taskModel = new TaskKonvert();
        return ResponseEntity.ok(taskService.save(task));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateTask(@RequestBody TaskModel task) {
        taskService.update(task);
        return ResponseEntity.ok(taskService.update(task));
    }


}
