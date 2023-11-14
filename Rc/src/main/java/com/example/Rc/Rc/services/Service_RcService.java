package com.example.Rc.Rc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.service_rc.Service_rc;
import com.example.Rc.Rc.data.service_rc.Service_rcRepo;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
public class Service_RcService implements GenericService <Service_rc> {
    private final Service_rcRepo repository;
    @Override
    public Service_rc findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Service_rc> findAll() {
        return repository.findAll();
    }

    @Override
    public Service_rc save(Service_rc entity) {
        return repository.save(entity);
    }

    @Override
    public Service_rc update(Service_rc entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
