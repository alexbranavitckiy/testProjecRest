package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.ProjectModel;
import scanpackage.service.ProjectService;

//@RequestMapping("/api/ba")
@RestController
@RequestMapping("/api/project")
public class ProjectController {


    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }


    @GetMapping(value = "/all")
    public ResponseEntity getAllProject() {
        return ResponseEntity.ok(projectService.getAll());
    }

    @GetMapping(value = "/name/{name}")
    public ResponseEntity findAllByName(@PathVariable(name = "name") String name) {
        return ResponseEntity.ok(projectService.findAllByName(name));
    }





    @PostMapping
    public ResponseEntity<ProjectModel> saveProject(@RequestBody ProjectModel project) {
        if (project != null && projectService.getAll().lastIndexOf(project) == -1) {
            System.out.println(projectService.getAll().indexOf(project));
            return ResponseEntity.ok(projectService.save(project));
        } else {
            return null;
        }
    }

//    @GetMapping(value = "/{cod_project}")
//    public ResponseEntity<ProjectModel> findTaskBycod_project(@PathVariable(name = "cod_project") Integer cod_project) {
//        ProjectModel projectModel = projectService.findById(cod_project);
//        return ResponseEntity.ok(projectModel);
//    }

//  getByIdTasjofProject(id: string): Observable<Task> {
//    return this.http.get<Task>('api/task/inProject' + id);
//  }




    @GetMapping(value = "/{id}")
    public ResponseEntity<ProjectModel> findProjectById(@PathVariable(name = "id") Integer id) {
        ProjectModel task = projectService.findById(id);
            return ResponseEntity.ok(task);
    }

}

