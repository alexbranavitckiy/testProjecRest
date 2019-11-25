package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.ProjectModel;
import scanpackage.service.ProjectService;

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
    public ResponseEntity getAllProject()
    {
        return ResponseEntity.ok(projectService.getAll());
    }


    @PostMapping
    public ResponseEntity<ProjectModel> saveProject(@RequestBody ProjectModel project) {
        if (project != null) {
            return ResponseEntity.ok(projectService.save(project));
        }
        return null;
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
