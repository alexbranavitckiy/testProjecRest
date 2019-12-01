package scanpackage.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import scanpackage.models.PriorityModel;
import scanpackage.models.StatusModel;
import scanpackage.service.GenericsService;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Service
public class PriorityServicelmlp implements GenericsService<PriorityModel> {


    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public PriorityModel save(PriorityModel user) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/api/status", user, PriorityModel.class).getBody();
    }

    @Override
    public List<PriorityModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        PriorityModel[] users = restTemplate.getForObject(backendServerUrl + "/api/status/all", PriorityModel[].class);
        return users == null ? Collections.emptyList() : Arrays.asList(users);
    }

    @Override
    public PriorityModel findById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/status/" + id, PriorityModel.class);
    }


    @Override
    public PriorityModel update(PriorityModel statusModel) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(backendServerUrl + "/api/task/" + statusModel.getId(), statusModel);
        return statusModel;
    }

}

