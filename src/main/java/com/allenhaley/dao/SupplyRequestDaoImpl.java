package com.allenhaley.dao;

import com.allenhaley.model.SupplyRequest;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
public class SupplyRequestDaoImpl implements SupplyRequestDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public SupplyRequest add(SupplyRequest obj) {
        Long id = (Long) sessionFactory.getCurrentSession().save(obj);
        obj.setReqId(id);
        return obj;
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

    @Override
    public List<SupplyRequest> getByEmpId(int id) {
        String hql = "From Supplyrequest sr Where sr.emp_id= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        return q.list();
    }
}
