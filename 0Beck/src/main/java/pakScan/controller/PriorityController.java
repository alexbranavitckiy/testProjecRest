package pakScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pakScan.entity.Priority;
import pakScan.entity.Status;
import pakScan.service.PriorityServiceBeck;
import pakScan.service.StatusServiceBeck;

@RestController
@RequestMapping("/api/priority")
public class PriorityController {

    public PriorityServiceBeck priorityService;

    @Autowired
    public PriorityController(PriorityServiceBeck statusService) {
        this.priorityService = statusService;
    }

    @GetMapping(value = "/all")
    public Iterable<Priority> getAll() {
        return priorityService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Priority findPriorityById(@PathVariable(name = "id") Integer id) {
        return priorityService.findById(id).get();
    }
}
