package pakScan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pakScan.entity.Project;
import pakScan.service.ProjectService;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public Project newProject(@RequestBody Project project) {
        return projectService.addProject(project);
    }

    @GetMapping(value = "/{id}")
    public Project findProjectById(@PathVariable(name = "id") Integer id) {
        return projectService.findById(id).get();
    }

    @GetMapping(value = "/all")
    public Iterable<Project> getAll() {
        return projectService.getAll();
    }


    @GetMapping(value = "/allName/{name}")
    public Iterable<Project> getAllName(@PathVariable(name = "name") String name) {
        return projectService.getAllName(name);
    }




}
