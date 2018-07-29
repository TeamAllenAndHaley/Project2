package com.allenhaley.dao;

import com.allenhaley.model.Location;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
public class LocationDaoImpl implements LocationDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Location obj) {

    }

    @Override
    public Collection<Location> all() {
        return null;
    }

    @Override
    public Location find(Serializable id) {
        return null;
    }

    @Override
    public void delete(Location obj) {

    }

    @Override
    public void update(Location obj) {

    }
}
