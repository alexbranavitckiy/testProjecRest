package scanpackage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.Convector;
import scanpackage.models.TaskKonvert;
import scanpackage.models.TaskModel;
import scanpackage.service.ProjectService;
import scanpackage.service.TaskService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/task")
public class TaskController {

    private TaskService taskService;
    private Convector convector;
    private ProjectService projectService;

    @Autowired
    public TaskController(TaskService taskService, Convector convector,ProjectService projectService) {
        this.convector = convector;
        this.projectService=projectService;
        this.taskService = taskService;
    }



    @GetMapping(value = "/deleteTask/{id}")
    public ResponseEntity deleteTaskTask(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(taskService.deleteTask(id));
    }






    @GetMapping(value = "/inProjectConvert/{id}")
    public ResponseEntity findByIdInProjectTask(@PathVariable(name = "id") Integer id) {
        return ResponseEntity.ok(taskService.findByIdInProjectConvert(id));
    }



    @GetMapping(value = "/all")
    public ResponseEntity getAllTask() {
        return ResponseEntity.ok(taskService.getAll());
    }


    @GetMapping(value = "status/{id}")
    public ResponseEntity<TaskModel> findTaskById(@PathVariable(name = "id") Integer id) {
        TaskModel task = taskService.findById(id);
        return ResponseEntity.ok(task);
    }

  @PostMapping(value = "saveTask")
     public ResponseEntity<TaskModel> saveTask(@RequestBody TaskKonvert task) {
           Convector convector = new Convector();
           System.out.println(task.toString()+"asddd!!!!!!!!!!!!!!!!!!!!");
          return ResponseEntity.ok(taskService.save(convector.convert(task)));
      }

   // @PostMapping(value = "saveTask")
 //   public ResponseEntity<TaskKonvert> saveTask(@RequestBody TaskKonvert task) {
  //      return ResponseEntity.ok(taskService.save(task));
  //  }

    @PutMapping(value = "/{id}")
    public ResponseEntity updateTask(@RequestBody TaskModel task) {
        taskService.update(task);
        return ResponseEntity.ok(taskService.update(task));
    }


}
