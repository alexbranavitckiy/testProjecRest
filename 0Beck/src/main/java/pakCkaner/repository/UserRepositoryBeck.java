package pakCkaner.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakCkaner.entity.User;


@Repository
public interface UserRepositoryBeck extends CrudRepository<User,Integer> {


  //  Optional<UsersEntity> findBySign(Sign sign);

  //  Iterable<UsersEntity> findUsersEntitiesByRoleIdRole(long id);



}
