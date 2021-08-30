package br.com.kirinus.kirimed.framework;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class CrudRestController<T, I> {

    public abstract JpaCrudService<T, I> getService();

    @GetMapping
    public List<T> findAll() {
        return getService().findAll();
    }

    @GetMapping("{id}")
    public Optional<T> findOne(@PathVariable I id) {
        return getService().findById(id);
    }

    @PostMapping
    public T save(@RequestBody T entity){
        return getService().save(entity);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable I id) {
        getService().deleteById(id);
    }
}
