package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.fonction.Fonction;
import com.example.Rc.Rc.data.fonction.FonctionRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;
@Service
@AllArgsConstructor
public class FonctionService implements GenericService<Fonction> {
    private final FonctionRepo repository;
    @Override
    public Fonction findById(Integer id) {
        return repository.findById(id).orElseThrow() ;
    }

    @Override
    public List<Fonction> findAll() {
        return repository.findAll();
    }

    @Override
    public Fonction save(Fonction entity) {
        return repository.save(entity);
    }

    @Override
    public Fonction update(Fonction entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }
}
