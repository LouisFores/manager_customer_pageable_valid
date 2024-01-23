package com.example.be1_practicecrud_managecustomer_usecrudrepository.service;

import java.util.Optional;

public interface IGenerateService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void remote(Long id);
}
