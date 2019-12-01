package pakScan.service;


import pakScan.entity.Priority;

import java.util.List;
import java.util.Optional;

public interface PriorityServiceBeck {

    Optional<Priority> findById(Integer id);

    Iterable<Priority> getAll();
}
