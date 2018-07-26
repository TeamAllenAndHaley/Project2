package com.allenhaley.dao;

import com.allenhaley.config.HibernateConfigUtil;
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
    public Location add(Location obj) {
        return obj;
    }

    @Override
    public Collection<Location> all() {
        return null;
    }

    @Override
    public Location find(Serializable id) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        String hql = "From Location l Where l.locId= :id";
        Query q = s.createQuery(hql);
        q.setParameter("id",id);
        List<Location> locations = q.list();
        s.getTransaction().commit();
        s.close();
        return locations.isEmpty() ? null : locations.get(0);
    }

    @Override
    public int delete(Location obj) {
        return 0;
    }

    @Override
    public int update(Location obj) {
        return 0;
    }
}
