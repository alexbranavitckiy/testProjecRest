package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.User;
import pakScan.repository.UserRepositoryBeck;
import pakScan.service.UserServiceBeck;


@Service
public class UserServiceImplBeck implements UserServiceBeck {

    @Autowired
    UserRepositoryBeck userRepository;


    @Override
    public User addUser(User user) {

        User nUser = userRepository.save(user);

        return nUser;
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
