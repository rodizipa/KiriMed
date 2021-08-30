package br.com.kirinus.kirimed.framework;

import java.util.List;
import java.util.Optional;

public interface JpaCrudService<T, I> {
    List<T> findAll();
    Optional<T> findById(I id);
    T save(T entity);
    void deleteById(I id);
    void preSave(T t);
    void postSave(T t);
}
