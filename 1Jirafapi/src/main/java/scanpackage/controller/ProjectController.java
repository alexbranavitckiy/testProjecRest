package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.ProjectModel;
import scanpackage.service.impl.ProjectDataService;

import java.util.List;

@RestController
@RequestMapping("/api/ba")
public class ProjectController {
    @Autowired
    private ProjectDataService projectDataService;


    @RequestMapping
    public ResponseEntity<List<ProjectModel>> getAllProjectVievs() {

        System.out.println("РАБОТАТЕТ getAll");
        return ResponseEntity.ok(projectDataService.getAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ProjectModel> saveBillingAccount(@RequestBody ProjectModel projectModel ) {
        System.out.println("РАБОТАТЕТ save");
        if (projectModel != null) {
            return ResponseEntity.ok(projectDataService.saveBillingAccount(projectModel));
        }
        return null;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable String id) {
        System.out.println("РАБОТАТЕТ delete");

        projectDataService.deleteBillingAccount(Long.valueOf(id));
    }

}
