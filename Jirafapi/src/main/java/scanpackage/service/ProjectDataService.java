package scanpackage.service;

import scanpackage.models.ProjectModel;

import java.util.List;

public    interface ProjectDataService {
    List<ProjectModel> getAll();
    ProjectModel getBillingAccountById(Long id);
    ProjectModel saveBillingAccount(ProjectModel projectModel);
    void deleteBillingAccount(Long id);
}
