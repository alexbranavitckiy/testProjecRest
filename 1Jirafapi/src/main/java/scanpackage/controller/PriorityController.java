package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.PriorityModel;
import scanpackage.service.GenericsService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/priority")
public class PriorityController {

    private GenericsService<PriorityModel> priorityService;

    @Autowired
    public PriorityController(GenericsService<PriorityModel> priorityService) {
        this.priorityService = priorityService;
    }

    @GetMapping(value = "/all")
    public ResponseEntity getAllPriority() {
        return ResponseEntity.ok(priorityService.getAll());
    }


    //  getAllStatus(): Observable<Status[]> {return this.http.get<Status[]>('api/status/all');}

    @GetMapping(value = "/{id}")
    public ResponseEntity<PriorityModel> findStatusById(@PathVariable(name = "id") Integer id) {
        PriorityModel task = priorityService.findById(id);
        if (task != null) {
            return ResponseEntity.ok(task);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public ResponseEntity<PriorityModel> saveStatus(@RequestBody PriorityModel statusModel) {
        System.out.println(statusModel);
        if (statusModel != null) {
            return ResponseEntity.ok(priorityService.save(statusModel));
        }
        return null;
    }
}
