package com.allenhaley.dao;

import com.allenhaley.config.HibernateConfigUtil;
import com.allenhaley.model.Housing;
import org.hibernate.Query;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class HousingDaoImpl implements HousingDao {
    @Override
    public void add(Housing obj) {

    }

    @Override
    public Collection<Housing> all() {
        return null;
    }

    @Override
    public Housing find(Serializable id) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        String hql = "From Housing h Where h.housingId= :id";
        Query q = s.createQuery(hql);
        q.setParameter("id",id);
        List<Housing> housing = q.list();
        s.getTransaction().commit();
        s.close();
        return housing.isEmpty() ? null : housing.get(0);
    }

    @Override
    public void delete(Housing obj) {

    }

    @Override
    public void update(Housing obj) {

    }
}
