package scanpackage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanpackage.models.UserModel;
import scanpackage.service.UserService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {
    public UserService userService;

    @Autowired
    public UserController(UserService userService) {this.userService = userService; }

    @GetMapping(value = "/all")
    public ResponseEntity getAllUser(){
      //  System.out.println("работает peoject fapi "+ userService.getAll().get(1).getName() +userService.getAll().get(1).getRole()+userService.getAll().get(1).getIdUsers());

        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping(value = "/{id}")
    public UserModel findUser(@PathVariable(name = "id") long id) {
        return userService.findById(id);
    }

    @PostMapping
    public ResponseEntity<UserModel> saveUser(@RequestBody UserModel user) {
        if (user != null) {
            return ResponseEntity.ok(userService.save(user));
        }
        return null;
    }


}
