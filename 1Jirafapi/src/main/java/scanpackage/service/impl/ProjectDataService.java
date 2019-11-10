package scanpackage.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import scanpackage.models.ProjectModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class ProjectDataService implements scanpackage.service.ProjectDataService {


    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<ProjectModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        ProjectModel[] projectModels = restTemplate.getForObject(backendServerUrl + "/api/billing-accounts/", ProjectModel[].class);
        return projectModels == null ? Collections.emptyList() : Arrays.asList(projectModels);}

    @Override
    public ProjectModel saveBillingAccount(ProjectModel projectModel) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/billing-accounts", projectModel, ProjectModel.class).getBody();
    }

    @Override
    public ProjectModel getBillingAccountById(Long id) {
        return null;
    }

    @Override
    public void deleteBillingAccount(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl + "/api/billing-accounts/" + id);
    }
}
