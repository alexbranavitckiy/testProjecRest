package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Status;
import pakScan.repository.StatusRepositoryBeck;
import pakScan.service.StatusServiceBeck;

import java.util.List;
import java.util.Optional;

@Service
public class StatusServiceImplBeck implements StatusServiceBeck {

    private StatusRepositoryBeck statusRepository;

    @Autowired
    public StatusServiceImplBeck(StatusRepositoryBeck statusRepository) {
        this.statusRepository = statusRepository;
    }

    @Override
    public Iterable<Status> getAll() {
        return statusRepository.findAll();
    }

    @Override
    public Status addStatus(Status task) {
        Status newTask = statusRepository.save(task);
        return newTask;
    }

    @Override
    public Optional<Status> findById(Integer id) {
        return statusRepository.findById(id);
    }


}
