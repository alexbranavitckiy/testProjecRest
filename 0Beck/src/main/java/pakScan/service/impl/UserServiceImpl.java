package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.User;
import pakScan.repository.UserRepository;
import pakScan.service.UserService;


@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) { return  userRepository.save(user);
    }

    @Override
    public User findById(Integer id) { return userRepository.findById(id).get();
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
