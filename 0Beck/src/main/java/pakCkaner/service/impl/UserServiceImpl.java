package pakCkaner.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakCkaner.entity.User;
import pakCkaner.repository.UserRepository;
import pakCkaner.service.UserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        User addUser = userRepository.save(user);
        return addUser;
    }

    @Override
    public User findById(Integer id) {
        User user = userRepository.findById(id).get();
       return user;
   }

    @Override
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
