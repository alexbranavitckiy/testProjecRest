package scanpackage.service.impl;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import scanpackage.models.TaskModel;
import scanpackage.service.TaskService;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {


    @Value("${backend.server.url}")
    private String backendServerUrl;

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<TaskModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        TaskModel[] taskModels = restTemplate.getForObject(backendServerUrl + "/api/task/all", TaskModel[].class);
        return taskModels == null ? Collections.emptyList() : Arrays.asList(taskModels);
    }


    @Override
    public TaskModel findById(Integer id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendServerUrl + "/api/task/" + id, TaskModel.class);
    }


    @Override
    public TaskModel save(TaskModel task) {

        System.out.println(task);

        // RestTemplate restTemplate = new RestTemplate();
        return null; //restTemplate.postForEntity(backendServerUrl+"/api/task", task, TaskModel.class).getBody();
    }

    @Override
    public TaskModel update(TaskModel task) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.put(backendServerUrl + "/api/task/" + task.getId(), task);
        return task;
    }


}
