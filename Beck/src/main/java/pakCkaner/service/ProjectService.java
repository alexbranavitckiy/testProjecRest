package pakCkaner.service;


import pakCkaner.entity.Project;

import java.util.Optional;

public interface ProjectService {

    Project saveProjectAccount(Project project);
    Optional<Project> getProjectAccountById(Long id);
    Iterable<Project> getProjectAccounts();
    void deleteProjectAccount(Long id);
}
