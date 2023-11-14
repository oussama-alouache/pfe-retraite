package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.retraite.Retraite;
import com.example.Rc.Rc.data.retraite.RetraiteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
public class RetraiteService  implements GenericService <Retraite> {
    private final RetraiteRepo repository;

    @Override
    public Retraite findById(Integer id) {
        return  repository.findById(id).orElseThrow();
    }

    @Override
    public List<Retraite> findAll() {
        return repository.findAll();
    }

    @Override
    public Retraite save(Retraite entity) {
        return repository.save(entity);
    }

    @Override
    public Retraite update(Retraite entity) {
         return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
