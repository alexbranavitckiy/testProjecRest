package pakCkaner.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakCkaner.entity.Project;
import pakCkaner.repository.ProjectRepositoryBeck;
import pakCkaner.service.ProjectServiceBeck;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImplBeck implements ProjectServiceBeck {

    @Autowired
    ProjectRepositoryBeck projectRepository;


    @Override
    public Project addProject(Project project) {
        Project nProject = projectRepository.save(project);
        return nProject;
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
