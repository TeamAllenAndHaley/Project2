package com.allenhaley.dao;

import com.allenhaley.model.Ticket;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
public class TicketDaoImpl implements TicketDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Ticket add(Ticket obj) {
        Integer id = (Integer)sessionFactory.getCurrentSession().save(obj);
        obj.setTicketId(id);
        return obj;
    }

    @Override
    public Collection<Ticket> all() {
        String hql = "From Ticket";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        return q.list();
    }

    @Override
    public Ticket find(Serializable id) {
        String hql = "From Ticket t Where t.ticketId= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Ticket> tickets = q.list();

        return tickets.isEmpty() ? null : tickets.get(0);
    }

    @Override
    public void delete(Ticket obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    @Override
    public void update(Ticket obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }
}
