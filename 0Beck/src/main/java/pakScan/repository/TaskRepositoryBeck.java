package pakScan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pakScan.entity.Task;

@Repository
public interface TaskRepositoryBeck extends JpaRepository<Task,Integer> {

}
