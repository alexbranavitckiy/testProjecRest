package pakCkaner.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakCkaner.entity.User;


@Repository
public interface UserRepositoryBeck extends CrudRepository<User,Integer> {




  //  Iterable<UsersEntity> findUsersEntitiesByRoleIdRole(long id);



}
