package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.periode.Periode;
import com.example.Rc.Rc.data.periode.PeriodeRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.generic.genericservices.GenericService;

import java.util.List;

@Service
@AllArgsConstructor
@PreAuthorize("hasRole('ADMIN')")
public class PeriodeService implements GenericService<Periode> {

private final PeriodeRepo repository;

    @Override
    public Periode findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @PreAuthorize("hasAuthority('admin:read')")
    @Override
    public List<Periode> findAll() {

        return repository.findAll();
    }



    @Override
    public Periode save(Periode entity) {


        return repository.save(entity);

    }

    @Override
    public Periode update(Periode entity) {

        return repository.save(entity);
    }


    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
