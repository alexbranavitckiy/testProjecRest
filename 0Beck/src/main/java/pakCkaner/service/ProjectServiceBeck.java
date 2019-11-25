package pakCkaner.service;

import pakCkaner.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectServiceBeck {
    Project addProject(Project project);
    Optional<Project> findById(Integer id);
    List<Project> getAll();
    void deleteProject(Integer Integer);
}
