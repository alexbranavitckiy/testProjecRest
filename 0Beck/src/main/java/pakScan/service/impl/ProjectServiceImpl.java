package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Project;
import pakScan.repository.ProjectRepository;
import pakScan.service.ProjectService;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;


    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public Project addProject(Project project) {
        Project aProject = projectRepository.save(project);
        return aProject;
    }


    @Override
    public List<Project> getAllName(String name) {
        System.out.println((List<Project>) projectRepository.findByName(name));
        return (List<Project>) projectRepository.findByName(name);

    }


    @Override
    public Optional<Project> findBycod_project(Integer cod_project) {
        return projectRepository.findById(cod_project);
    }

    @Override
    public Optional<Project> findById(Integer id) {
        return projectRepository.findById(id);
    }


    @Override
    public List<Project> getAll() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public void deleteProject(Integer id) {
        projectRepository.deleteById(id);
    }

}
