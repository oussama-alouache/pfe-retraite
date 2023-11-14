package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.rebrique_paie.Rebrique_paie;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.rebrique_paie.Rebrique_paieRepo;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
public class Rebrique_PaieService implements GenericService <Rebrique_paie> {
    private final Rebrique_paieRepo repository;

    @Override
    public Rebrique_paie findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Rebrique_paie> findAll() {
        return repository.findAll();
    }

    @Override
    public Rebrique_paie save(Rebrique_paie entity) {
        return repository.save(entity);
    }

    @Override
    public Rebrique_paie update(Rebrique_paie entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
