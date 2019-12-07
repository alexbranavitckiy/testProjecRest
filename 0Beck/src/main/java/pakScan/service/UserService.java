package pakScan.service;


import pakScan.entity.User;


public interface UserService {
    User addUser(User user);

    User findById(Integer id);

    Iterable<User> getAll();

    void deleteUser(Integer id);
}




