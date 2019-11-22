package pakCkaner.service;


import pakCkaner.entity.User;

public interface UserService {
    User addUser(User user);
   User findById(Integer id);
    Iterable<User> getAll();
    void deleteUser(Integer id);
}
