package scanpackage.service;

import scanpackage.models.ProjectModel;

import java.util.List;

public interface ProjectService {

    List<ProjectModel> getAll();
    List<ProjectModel> findAllByObject(ProjectModel name);
    ProjectModel findById(Integer id);
    List<ProjectModel> findAllByName(String name);
    ProjectModel save(ProjectModel project);

}
