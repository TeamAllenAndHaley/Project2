package com.allenhaley.dao;

import java.io.Serializable;
import java.util.Collection;

public interface BaseDao<T> {

    T add(T obj);

    Collection<T> all();

    T find(Serializable id);

    void delete(T obj);

    void update(T obj);

}
