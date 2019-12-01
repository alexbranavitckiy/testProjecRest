package pakScan.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakScan.entity.Status;

@Repository
public interface StatusRepositoryBeck extends CrudRepository<Status, Integer> {
}
