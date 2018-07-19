package com.allenhaley.dao;

import java.io.Serializable;
import java.util.Collection;

public interface BaseDao<T> {

    T add(T obj);

    Collection<T> all();

    T find(Serializable id);

    int delete(T obj);

    int update(T obj);

}
