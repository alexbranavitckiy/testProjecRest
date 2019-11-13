package pakCkaner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pakCkaner.entity.Project;
import pakCkaner.service.ProjectService;

import java.util.Optional;


@RestController
@RequestMapping("/api/billing-accounts")
public class ProjectControllrt {
    private ProjectService projectService;
    @Autowired
    public ProjectControllrt(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Iterable<Project> getAllProject() {

        return projectService.getProjectAccounts();


    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Project> getProjecId(@PathVariable(name = "id") Long id) {
        Optional<Project> billingProgect = projectService.getProjectAccountById(id);
        if (billingProgect.isPresent()) {
            return ResponseEntity.ok(billingProgect.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public Project saveProjecValues(@RequestBody Project project) {
        return projectService.saveProjectAccount(project);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBillingAccount(@PathVariable(name = "id") Long id) {
        projectService.deleteProjectAccount(id);
    }

}

