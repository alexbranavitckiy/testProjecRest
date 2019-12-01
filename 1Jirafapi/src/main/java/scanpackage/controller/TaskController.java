package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.StatusModel;
import scanpackage.models.TaskModel;
import scanpackage.service.TaskService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/task")
public class TaskController {

    public TaskService taskService;

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
        if (task != null) {
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping
    public ResponseEntity<TaskModel> saveTask(@RequestBody TaskModel task) {
       System.out.println(task);
        if (task != null) {




            return ResponseEntity.ok(taskService.save(task));
        }
        return null;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateTask(@RequestBody TaskModel task) {
        taskService.update(task);
        return ResponseEntity.ok(taskService.update(task));
    }




}
