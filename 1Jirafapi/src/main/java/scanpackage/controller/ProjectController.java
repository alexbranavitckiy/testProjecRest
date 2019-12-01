package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import scanpackage.exceptionMessage.ApiError;
import scanpackage.exceptionMessage.EntityNotFoundException;
import scanpackage.models.ProjectModel;
import scanpackage.service.ProjectService;

import javax.validation.Valid;
import java.util.List;

//@RequestMapping("/api/ba")
@RestController
@RequestMapping("/api/project")
public class ProjectController {
    public ProjectService projectService;


    @Autowired
    public ProjectController(ProjectService projectService) {


        this.projectService = projectService;
    }


    @GetMapping(value = "/all")
    public ResponseEntity getAllProject() {
        return ResponseEntity.ok(projectService.getAll());
    }


    @PostMapping
    //  @ResponseStatus(HttpStatus.BAD_REQUEST) @Valid
    public ResponseEntity<ProjectModel> saveProject(@RequestBody ProjectModel project) {
        if (project != null && projectService.getAll().lastIndexOf(project) == -1) {
            project.setCod_project(project.getName().hashCode() + "");
            System.out.println(project.getCod_project());
            System.out.println(projectService.getAll().indexOf(project));
            return ResponseEntity.ok(projectService.save(project));
        } else {
            return null;
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProjectModel> findTaskById(@PathVariable(name = "id") Integer id) {
        ProjectModel task = projectService.findById(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}


//   @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<ProjectModel> saveBillingAccount(@RequestBody ProjectModel projectModel ) {
//        System.out.println("РАБОТАТЕТ save");
//        if (projectModel != null) {
//            return ResponseEntity.ok(projectDataServiceImpl.saveBillingAccount(projectModel));
//        }
//        return null;
//    }
//
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteBillingAccount(@PathVariable String id) {
//        System.out.println("РАБОТАТЕТ delete");
//
//        projectDataServiceImpl.deleteBillingAccount(Long.valueOf(id));
//    }

//}
