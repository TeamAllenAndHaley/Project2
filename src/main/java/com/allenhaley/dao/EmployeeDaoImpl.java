package com.allenhaley.dao;

import com.allenhaley.model.Employee;
import org.hibernate.Query;
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
    public Employee add(Employee obj) {
        Integer id = (Integer)sessionFactory.getCurrentSession().save(obj);
        obj.setEmpId(id);
        return obj;
    }

    @Override
    public Collection<Employee> all() {
        String hql = "From Employee";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        return q.list();
    }

    @Override
    public Employee find(Serializable id) {
       String hql = "From Employee e Where e.empId= :id";
       Query q = sessionFactory.getCurrentSession().createQuery(hql);
       q.setParameter("id",id);
       List<Employee> employees = q.list();

       return employees.isEmpty() ? null : employees.get(0);
    }

    @Override
    public void delete(Employee obj) {
        sessionFactory.getCurrentSession().delete(obj);
    }

    @Override
    public void update(Employee obj) {
        sessionFactory.getCurrentSession().saveOrUpdate(obj);
    }

    @Override
    public Employee findByEmail(String email) {
        String hql = "From Employee e Where e.email= :email";
        Query q = sessionFactory.getCurrentSession().createQuery(hql);
        q.setParameter("email",email);
        List<Employee> employees = q.list();

        return employees.isEmpty() ? null : employees.get(0);
    }
}
