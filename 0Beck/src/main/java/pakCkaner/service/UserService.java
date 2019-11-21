package pakCkaner.service;


import pakCkaner.entity.User;

public interface UserService {
    User addUser(User user);
   User findById(Long id);
    Iterable<User> getAll();
    void deleteUser(Long id);
}
