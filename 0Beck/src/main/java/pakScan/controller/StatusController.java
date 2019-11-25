package pakScan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pakScan.entity.Status;
import pakScan.service.StatusServiceBeck;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    public StatusServiceBeck statusService;

    @Autowired
    public StatusController(StatusServiceBeck statusService){this.statusService = statusService;}

    @GetMapping(value = "/all")
    public Iterable<Status> getAll(){return statusService.getAll();}

}
