package scanpackage.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import scanpackage.models.UserModel;
import scanpackage.service.UserServic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Service
public class UserServiceImp  implements UserServic {

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public UserModel save(UserModel user) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl+"/api/user", user, UserModel.class).getBody();
    }

    @Override
    public List<UserModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        UserModel[] users = restTemplate.getForObject(backendServerUrl + "/api/user/all",UserModel[].class);
        return users == null ? Collections.emptyList() : Arrays.asList(users);
    }

    @Override
    public UserModel findById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/user/" + id, UserModel.class);
    }



}
