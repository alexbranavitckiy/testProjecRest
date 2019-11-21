package scanpackage.service;

import scanpackage.models.ProjectModel;

import java.util.List;

public interface ProjectService {
    List<ProjectModel> getAll();
    ProjectModel findById(long id);
    ProjectModel save(ProjectModel project);
}
