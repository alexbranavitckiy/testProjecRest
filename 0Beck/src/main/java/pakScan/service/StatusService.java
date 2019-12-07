package pakScan.service;


import pakScan.entity.Status;

import java.util.Optional;

public interface StatusService {
    Iterable<Status> getAll();

    Status addStatus(Status task);

    Optional<Status> findById(Integer id);
}
