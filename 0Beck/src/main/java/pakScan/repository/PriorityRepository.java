package pakScan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pakScan.entity.Priority;
import pakScan.entity.Status;


@Repository
public interface PriorityRepository extends CrudRepository<Priority, Integer> {
}
