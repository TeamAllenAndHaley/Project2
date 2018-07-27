package com.allenhaley.dao;

import com.allenhaley.config.HibernateConfigUtil;
import com.allenhaley.model.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void add(Employee obj) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        s.save(obj);

        s.getTransaction().commit();
        s.close();
    }

    @Override
    public Collection<Employee> all() {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        String hql = "From Employee";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        List<Employee> employees = query.list();

        s.getTransaction().commit();
        s.close();

        return employees;
    }

    @Override
    public Employee find(Serializable id) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        String hql = "From Employee e Where e.empId= :id";
        Query q = s.createQuery(hql);
        q.setParameter("id",id);
        List<Employee> employees = q.list();

        s.getTransaction().commit();
        s.close();

        return employees.isEmpty() ? null : employees.get(0);
    }

    @Override
    public void delete(Employee obj) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        s.delete(obj);

        s.getTransaction().commit();
        s.close();
    }

    @Override
    public void update(Employee obj) {
        Session s = HibernateConfigUtil.getSessionFactory().openSession();
        s.beginTransaction();

        s.saveOrUpdate(obj);

        s.getTransaction().commit();
        s.close();
    }
}
