package pakScan.service;


import pakScan.entity.Status;

import java.util.List;
import java.util.Optional;

public interface StatusServiceBeck {
    Iterable<Status> getAll();

    Status addStatus(Status task);

    Optional<Status> findById(Integer id);
}
