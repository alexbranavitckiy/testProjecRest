package pakScan.service;


import pakScan.entity.Priority;

import java.util.Optional;

public interface PriorityService {

    Optional<Priority> findById(Integer id);

    Iterable<Priority> getAll();
}
