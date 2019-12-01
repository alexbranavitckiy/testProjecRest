package scanpackage.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import scanpackage.models.StatusModel;
import scanpackage.models.TaskModel;
import scanpackage.service.GenericsService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Service
public class StatusServiceIml implements GenericsService<StatusModel> {


    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public StatusModel save(StatusModel user) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/status", user, StatusModel.class).getBody();
    }

    @Override
    public List<StatusModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        StatusModel[] users = restTemplate.getForObject(backendServerUrl + "/api/status/all", StatusModel[].class);
        return users == null ? Collections.emptyList() : Arrays.asList(users);
    }

    @Override
    public StatusModel findById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/status/" + id, StatusModel.class);
    }


    @Override
    public StatusModel update(StatusModel statusModel) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(backendServerUrl + "/api/task/" + statusModel.getId(), statusModel);
        return statusModel;
    }

}
