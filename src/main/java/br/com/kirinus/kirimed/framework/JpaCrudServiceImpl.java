package br.com.kirinus.kirimed.framework;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class JpaCrudServiceImpl<T, I> implements JpaCrudService<T, I> {
    public abstract JpaRepository<T, I> getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Optional<T> findById(I id) {
        return getRepository().findById(id);
    }

    @Override
    public T save(T entity) {
        preSave(entity);
        entity = getRepository().save(entity);
        postSave(entity);
        return entity;
    }

    @Override
    public void deleteById(I id) {
        getRepository().deleteById(id);
    }

    @Override
    public void preSave(T t) {

    }

    @Override
    public void postSave(T t) {

    }
}
