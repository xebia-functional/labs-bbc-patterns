package com.fortysevendeg.bbc.patterns.layers.persistence.impl;

import com.fortysevendeg.bbc.patterns.layers.entity.Persistent;
import com.fortysevendeg.bbc.patterns.layers.persistence.PersistenceService;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A persistence service impl
 */
@SuppressWarnings("unchecked")
public class PersistenceServiceImpl<T extends Persistent> implements PersistenceService<T> {

    private ConcurrentHashMap<String, Object> database = new ConcurrentHashMap<String, Object>();

    @Override
    public T get(String id) {
        return (T) database.get(id);
    }

    @Override
    public T save(T entity) {
        entity.setId(UUID.randomUUID().toString());
        database.putIfAbsent(entity.getId(), entity);
        return entity;
    }
}
