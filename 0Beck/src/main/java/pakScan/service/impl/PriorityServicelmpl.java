package pakScan.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pakScan.entity.Priority;
import pakScan.repository.PriorityRepository;
import pakScan.service.PriorityService;

import java.util.Optional;

@Service
public class PriorityServicelmpl implements PriorityService {

    private PriorityRepository priorityRepository;

    @Autowired
    public PriorityServicelmpl(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @Override
    public Iterable<Priority> getAll() {
        return priorityRepository.findAll();
    }


    @Override
    public Optional<Priority> findById(Integer id) {
        return priorityRepository.findById(id);
    }


}


