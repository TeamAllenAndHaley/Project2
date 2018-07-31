package com.allenhaley.dao;

import com.allenhaley.model.Location;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
public class LocationDaoImpl implements LocationDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Location add(Location obj) {
        return null;
    }

    @Override
    public Collection<Location> all() {
        return null;
    }

    @Override
    public Location find(Serializable id) {
        String hql = "From Location l Where l.locId= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("id", id);
        List<Location> locations = q.list();

        return locations.isEmpty() ? null : locations.get(0);
    }

    @Override
    public void delete(Location obj) {

    }

    @Override
    public void update(Location obj) {

    }
}
