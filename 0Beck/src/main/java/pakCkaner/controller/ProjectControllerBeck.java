package pakCkaner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pakCkaner.entity.Project;
import pakCkaner.service.ProjectServiceBeck;

@RestController
@RequestMapping("/api/project")
public class ProjectControllerBeck {

    public ProjectServiceBeck projectService;

    @Autowired
    public ProjectControllerBeck(ProjectServiceBeck projectService){this.projectService = projectService;}

    @PostMapping
    public Project newProject(@RequestBody Project project){return projectService.addProject(project);}

    @GetMapping(value = "/{id}")
    public Project findProjectById(@PathVariable(name = "id") Integer id){return projectService.findById(id).get();}

    @GetMapping(value = "/all")
    public Iterable<Project> getAll(){
        return projectService.getAll();}
}
