package com.example.Rc.Rc.services;

import com.example.Rc.Rc.data.bilanpaie.BilapaieRepo;
import io.swagger.v3.oas.annotations.Hidden;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.bilanpaie.Bilanpaie;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;
@Service

@AllArgsConstructor
@PreAuthorize("hasRole('ADMIN')")

public class BilanService implements GenericService<Bilanpaie> {

    private final BilapaieRepo repository;

    @Override

    @PreAuthorize("hasAuthority('admin:read')")
    public Bilanpaie findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    @PreAuthorize("hasAuthority('admin:read')")
    public List<Bilanpaie> findAll() {
        return repository.findAll();
    }

    @Override
    @PreAuthorize("hasAuthority('admin:create')")
    @Hidden
    public Bilanpaie save(Bilanpaie entity) {
        return repository.save(entity);
    }

    @Override
    @PreAuthorize("hasAuthority('admin:update')")
    @Hidden
    public Bilanpaie update(Bilanpaie entity) {
        return repository.save(entity);
    }

    @Override
    @PreAuthorize("hasAuthority('admin:delete')")
    @Hidden
    public void delete(Integer id) {
        repository.deleteById(id);

    }
}
