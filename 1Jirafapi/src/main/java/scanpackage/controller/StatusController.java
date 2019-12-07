package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.StatusModel;
import scanpackage.service.GenericsService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/status")
public class StatusController {

    private GenericsService<StatusModel>  statusService;

    @Autowired
    public StatusController(GenericsService<StatusModel> statusService) {
        this.statusService = statusService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity getAllStatus() {
        return ResponseEntity.ok(statusService.getAll());
    }


    //  getAllStatus(): Observable<Status[]> {return this.http.get<Status[]>('api/status/all');}

    @GetMapping(value = "/{id}")
    public ResponseEntity<StatusModel> findStatusById(@PathVariable(name = "id") Integer id) {
        StatusModel task = statusService.findById(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<StatusModel> saveStatus(@RequestBody StatusModel statusModel) {
        System.out.println(statusModel);
        if (statusModel != null) {
            return ResponseEntity.ok(statusService.save(statusModel));
        }
        return null;
    }
}
