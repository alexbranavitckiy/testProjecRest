package scanpackage.service;

import scanpackage.models.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> getAll();
    UserModel findById(long id);
    UserModel save(UserModel user);

}
