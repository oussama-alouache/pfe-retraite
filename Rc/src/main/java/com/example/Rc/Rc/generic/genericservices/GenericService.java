package com.example.Rc.Rc.generic.genericservices;

import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Service;

import java.util.List;
public interface GenericService<T> {
    T findById(Integer  id);
    List<T> findAll();
    T save(T entity);


    T update(T entity);
    void delete(Integer id);
}
