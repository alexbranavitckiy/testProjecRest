package pakCkaner.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pakCkaner.entity.User;
import pakCkaner.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

   @Autowired
   public UserController(UserService userService) {this.userService = userService; }

    @GetMapping(value = "/all")
   public Iterable<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User newUser(@RequestBody User account) {
        return userService.addUser(account);
    }


    @GetMapping(value = "/{idUsers}")
    public ResponseEntity<User> findUserById(@PathVariable(name = "idUsers") Long idUsers) {
        User user = userService.findById(idUsers);
       return ResponseEntity.ok(user);
    }


   @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
   }

}
