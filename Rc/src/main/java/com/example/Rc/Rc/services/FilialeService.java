package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.filiale.Filiale;
import com.example.Rc.Rc.data.filiale.FilialeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;
@Service
@AllArgsConstructor

public class FilialeService implements GenericService<Filiale> {
    private final FilialeRepo repository;
    @Override
    public Filiale findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Filiale> findAll() {
        return repository.findAll();
    }

    @Override
    public Filiale save(Filiale entity) {
        return repository.save(entity);
    }

    @Override
    public Filiale update(Filiale entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }
}
