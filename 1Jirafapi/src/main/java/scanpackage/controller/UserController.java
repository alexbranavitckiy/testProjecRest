package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.UserModel;
import scanpackage.service.UserServic;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    private UserServic userService;

    @Autowired
    public UserController(UserServic userService) {this.userService = userService; }

    @GetMapping(value = "/all")
    public ResponseEntity getAllUser(){
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping(value = "/{id}")
    public UserModel findUser(@PathVariable(name = "id") long id) {
        return userService.findById(id);
    }

    @PostMapping
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user) {
        if (user != null&& userService.getAll().lastIndexOf(user) == -1) {
            user.setId(user.getLogin().hashCode());
            return ResponseEntity.ok(userService.save(user));
        }
        return null;
    }


}
