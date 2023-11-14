package com.example.Rc.Rc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.paie_valorise_rubrique.Paie_valorise_rubrique;
import com.example.Rc.Rc.data.paie_valorise_rubrique.Paie_valorise_rubriqueRepo;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
public class Paie_Valorise_RebriqueService implements GenericService<Paie_valorise_rubrique> {
    private final Paie_valorise_rubriqueRepo repository;
    @Override
    public Paie_valorise_rubrique findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Paie_valorise_rubrique> findAll() {
        return repository.findAll();
    }

    @Override
    public Paie_valorise_rubrique save(Paie_valorise_rubrique entity) {
        return repository.save(entity);
    }

    @Override
    public Paie_valorise_rubrique update(Paie_valorise_rubrique entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
