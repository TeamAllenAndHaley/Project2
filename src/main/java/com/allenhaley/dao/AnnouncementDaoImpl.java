package com.allenhaley.dao;

import com.allenhaley.model.Announcement;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class AnnouncementDaoImpl implements AnnouncementDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Announcement add(Announcement obj) {
        Integer id = (Integer)sessionFactory.getCurrentSession().save(obj);
        obj.setaId(id);
        return obj;
    }

    @Override
    public Collection<Announcement> all() {
        String hql = "From Announcement";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        return q.list();
    }

    @Override
    public Announcement find(Serializable id) {
        String hql = "From Announcement a Where a.aId= :id";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        List<Announcement> announcements = q.list();

        return announcements.isEmpty() ? null : announcements.get(0);
    }

    @Override
    public void delete(Announcement obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    @Override
    public void update(Announcement obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }
}
