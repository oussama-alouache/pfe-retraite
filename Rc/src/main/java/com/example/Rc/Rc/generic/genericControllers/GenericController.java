package com.example.Rc.Rc.generic.genericControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Rc.Rc.generic.genericservices.GenericService;


import java.util.List;
@CrossOrigin(value = {"http://localhost:4200"})
public abstract class GenericController<T> {
    public final GenericService<T> service;

    public GenericController(GenericService<T> service) {
        this.service = service;
    }


    @GetMapping
    public List<T> getAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findAll()).getBody();
    }

    @GetMapping("/{id}")
    public T getbyid(@PathVariable Integer id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(service.findById(id)).getBody();
    }


    @PostMapping
    public T create(@RequestBody T entity) {
        return service.save(entity);
    }

    @PutMapping
    public T update( @RequestBody T entity) {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
