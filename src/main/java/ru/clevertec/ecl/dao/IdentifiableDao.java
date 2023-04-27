package ru.clevertec.ecl.dao;

import ru.clevertec.ecl.entity.Identifiable;

import java.util.List;
import java.util.Optional;

public interface IdentifiableDao<T extends Identifiable,K> {
    T create(T entity);

    Optional<T> findById(K id);

    T update(T entity);

    List<T> findAll();

    Optional<T> deleteById(K id);
}
