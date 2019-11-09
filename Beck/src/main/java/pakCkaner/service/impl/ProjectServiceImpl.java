package pakCkaner.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pakCkaner.entity.Project;
import pakCkaner.repository.ProjectRepository;
import pakCkaner.service.ProjectService;

import java.util.Optional;


@Component
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository repository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository repository) {
        this.repository = repository;
    }



    @Override
    public Iterable<Project> getProjectAccounts() {
        return repository.findAll();
    }



    @Override
    public void deleteProjectAccount(Long id) {
            repository.deleteById(id);
        }

    @Override
    public Optional<Project> getProjectAccountById(Long id) {
            return repository.findById(id);
        }

    @Override
    public Project saveProjectAccount(Project project) {
            return repository.save(project);
    }
}
