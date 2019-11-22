package pakCkaner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pakCkaner.entity.Project;
import pakCkaner.service.ProjectService;


@RestController
@RequestMapping("/api/project")
public class ProjectController {

    public ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService){this.projectService = projectService;}

    @PostMapping
    public Project newProject(@RequestBody Project project){return projectService.addProject(project);}

    @GetMapping(value = "/{id}")
    public Project findProjectById(@PathVariable(name = "id") Long id){return projectService.findById(id).get();}

    @GetMapping(value = "/all")
    public Iterable<Project> getAll(){
      //  System.out.println("работает peoject beck"+ projectService.getAll().get(0).getIdproject() +projectService.getAll().get(0).getSummary()+projectService.getAll().get(0).getNameproject());
        return projectService.getAll();}
}
