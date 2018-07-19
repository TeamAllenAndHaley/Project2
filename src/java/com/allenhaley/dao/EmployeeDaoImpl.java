package com.allenhaley.dao;

import com.allenhaley.model.Employee;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Collection;

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
        String hql = "from Employee";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return query.list();
    }

    @Override
    public Employee find(Serializable id) {
        return null;
    }

    @Override
    public int delete(Employee obj) {
        return 0;
    }

    @Override
    public int update(Employee obj) {
        return 0;
    }
}
