package com.example.Rc.Rc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.Rc.Rc.data.element_paiment.Element_paiment;
import com.example.Rc.Rc.data.element_paiment.Element_paimentRepo;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;

@Service
@AllArgsConstructor
public class Element_paimentService implements GenericService<Element_paiment> {
    private final Element_paimentRepo repository;
    @Override
    public Element_paiment findById(Integer id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public List<Element_paiment> findAll() {
        return repository.findAll();
    }

    @Override
    public Element_paiment save(Element_paiment entity) {
        return repository.save(entity);
    }

    @Override
    public Element_paiment update(Element_paiment entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Integer id) {
repository.deleteById(id);
    }
}
