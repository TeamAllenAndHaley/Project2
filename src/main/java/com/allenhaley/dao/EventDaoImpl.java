package com.allenhaley.dao;

import com.allenhaley.model.Event;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class EventDaoImpl implements EventDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Event add(Event obj) {
        Integer id = (Integer)sessionFactory.getCurrentSession().save(obj);
        obj.setEvtId(id);
        return obj;
    }

    @Override
    public Collection<Event> all() {
        String hql = "From Event";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        return q.list();
    }

    @Override
    public Event find(Serializable id) {
        String hql = "From Event e Where e.evtId= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Event> events = q.list();

        return events.isEmpty() ? null : events.get(0);
    }

    @Override
    public void delete(Event obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    @Override
    public void update(Event obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }
}
