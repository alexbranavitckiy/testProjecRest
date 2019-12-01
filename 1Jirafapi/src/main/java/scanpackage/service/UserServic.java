package scanpackage.service;

import scanpackage.models.UserModel;

import java.util.List;

public interface UserServic {
    List<UserModel> getAll();

    UserModel findById(long id);

    UserModel save(UserModel user);

}
