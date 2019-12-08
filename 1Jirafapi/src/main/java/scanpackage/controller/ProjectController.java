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
        // ArrayList arrayList=new ArrayList();
        //        arrayList.add((projectService.findAllByName(name)));
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

    @GetMapping(value = "/{cod_project}")
    public ResponseEntity<ProjectModel> findTaskBycod_project(@PathVariable(name = "cod_project") Integer cod_project) {
        ProjectModel projectModel = projectService.findById(cod_project);
        if (projectModel != null) {
            return ResponseEntity.ok(projectModel);
        } else {
            return ResponseEntity.notFound().build();
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
