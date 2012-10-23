package com.fortysevendeg.bbc.patterns.layers.persistence;

import com.fortysevendeg.bbc.patterns.layers.entity.Persistent;

/**
 * A generic interface for persistence related operations
 */
public interface PersistenceService<T extends Persistent> {

    T get(String id);

    T save(T entity);

}
