package ru.clevertec.ecl.service;

import java.util.List;

public interface IdentifiableService<T> {

    List<T> findAll();

    T findById(Long id);

    T save(T entityDto);

    T update(T entityDto);

    void delete(Long id);
}
