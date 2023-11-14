package com.example.Rc.Rc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.etat_presence.Etat_p;
import com.example.Rc.Rc.data.etat_presence.Etat_pRepo;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;
@Service
@AllArgsConstructor
public class Etat_presenceService implements GenericService<Etat_p> {
    private final Etat_pRepo repository;
    @Override
    public Etat_p findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Etat_p> findAll() {
        return repository.findAll();
    }

    @Override
    public Etat_p save(Etat_p entity) {
        return repository.save(entity);
    }

    @Override
    public Etat_p update(Etat_p entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }
}
