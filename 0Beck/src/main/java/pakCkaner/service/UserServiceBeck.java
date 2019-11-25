package pakCkaner.service;


import pakCkaner.entity.User;


public interface UserServiceBeck {
    User addUser(User user);
    User findById(Integer id);
    Iterable<User> getAll();
    void deleteUser(Integer id);
 //   User findByLogin(String login);
 //   Iterable<User> getAllByRole(Integer role);
}



//public interface UserServiceBeck {
//    User addUser(User user);
//   User findById(Integer id);
//    Iterable<User> getAll();
//    void deleteUser(Integer id);
//}
