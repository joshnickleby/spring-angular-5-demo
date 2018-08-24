package com.astontech.angularspringtutorial.services;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface DirectorService<T> {

    /**
     *  The supplier provides the services function to check the record's existence
     *  while the runnable runs the delete function if it exists.
     *
     * @param existenceCheck
     * @param deleteFn
     * @return
     */
    default boolean deleteCheck(Supplier<Boolean> existenceCheck, Runnable deleteFn) {
        if(existenceCheck.get()) {
            deleteFn.run();

            if (existenceCheck.get()) { return false; }
        } else {
            return false;
        }

        return true;
    }

    default T getById(CrudRepository<T, Long> repo, Long id, Supplier<T> defaultObj) {
        return repo.findById(id).orElseGet(defaultObj);
    }

    T getById(Long id);

    default List<T> list(CrudRepository<T, Long> repo, boolean parallel) {
        return StreamSupport.stream(repo.findAll().spliterator(), parallel).collect(Collectors.toList());
    }

    List<T> list();

    default T save(CrudRepository<T, Long> repo, T t) {
        return repo.save(t);
    }

    T save(T t);

    default List<T> saveList(CrudRepository<T, Long> repo, List<T> ts) {
        return ts.parallelStream().peek(repo::save).collect(Collectors.toList());
    }

    List<T> saveList(List<T> list);

    default boolean delete(CrudRepository<T, Long> repo, Long id) {
        if(exists(repo, id)) {
            repo.deleteById(id);
            return !exists(repo, id);
        }

        return false;
    }

    boolean delete(Long id);

    default boolean exists(CrudRepository<T, Long> repo, Long id) {
        return repo.existsById(id);
    }

    boolean exists(Long id);
}
