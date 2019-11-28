package pakScan.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pakScan.entity.User;
import pakScan.service.UserServiceBeck;

@RestController
@RequestMapping("/api/user")
public class UserControllerBeck {
    private UserServiceBeck userService;

   @Autowired
   public UserControllerBeck(UserServiceBeck userService) {this.userService = userService; }



    @GetMapping(value = "/all")
   public Iterable<User> getAll() {
        return userService.getAll();
    }


    @PostMapping
    public User newUser(@RequestBody User account) {
        return userService.addUser(account);
    }


    @GetMapping(value = "/{idUsers}")
    public ResponseEntity<User> findUserById(@PathVariable(name = "idUsers") Integer idUsers) {
        User user = userService.findById(idUsers);
       return ResponseEntity.ok(user);
    }


   @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteUser(@PathVariable(name = "id") Integer id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
   }

}
