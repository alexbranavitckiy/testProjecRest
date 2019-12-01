package pakScan.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakScan.entity.User;


@Repository
public interface UserRepositoryBeck extends CrudRepository<User, Integer> {


}
