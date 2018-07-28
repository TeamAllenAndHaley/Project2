package com.allenhaley.dao;

import com.allenhaley.model.SupplyRequest;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class SupplyRequestDaoImpl implements SupplyRequestDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(SupplyRequest obj) {
        sessionFactory.getCurrentSession().save(obj);
    }

    @Override
    public Collection<SupplyRequest> all() {
        String hql = "From Supplyrequest";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        return q.list();
    }

    @Override
    public SupplyRequest find(Serializable id) {
        String hql = "From Supplyrequest sr Where sr.reqId= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("id",id);
        List<SupplyRequest> requests = q.list();
        return requests.isEmpty() ? null : requests.get(0);
    }

    @Override
    public void delete(SupplyRequest obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    @Override
    public void update(SupplyRequest obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }
}
