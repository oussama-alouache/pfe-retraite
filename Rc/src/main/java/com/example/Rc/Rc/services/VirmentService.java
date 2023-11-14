package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.virment.Virment;
import com.example.Rc.Rc.data.virment.VirmentRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
public class VirmentService implements GenericService<Virment> {
    private final VirmentRepo repository;
    @Override
    public Virment findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Virment> findAll() {
        return repository.findAll();
    }

    @Override
    public Virment save(Virment entity) {
        return repository.save(entity);
    }

    @Override
    public Virment update(Virment entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
