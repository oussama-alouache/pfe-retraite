package com.example.Rc.Rc.services;

import com.example.Rc.Rc.generic.genericservices.GenericService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.bureau_gestionnaire.Bureau_gest;
import com.example.Rc.Rc.data.bureau_gestionnaire.Bureau_gestRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class Buerea_GesService implements GenericService<Bureau_gest> {
    private final Bureau_gestRepo repository;
    @Override
    public Bureau_gest findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Bureau_gest> findAll() {
        return repository.findAll();
    }

    @Override
    public Bureau_gest save(Bureau_gest entity) {
        return repository.save( entity);
    }

    @Override
    public Bureau_gest update(Bureau_gest entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }
}
