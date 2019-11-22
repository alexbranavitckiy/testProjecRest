package pakCkaner.service;

import pakCkaner.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    Project addProject(Project project);
    Optional<Project> findById(Long id);
    List<Project> getAll();
    void deleteProject(Long Integer);
}
