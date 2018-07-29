package com.allenhaley.services;

import com.allenhaley.dao.BaseDao;
import com.allenhaley.dao.EmployeeDao;
import com.allenhaley.dao.EmployeeDaoImpl;
import com.allenhaley.model.Employee;
import com.allenhaley.model.Housing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Transactional
    public void saveEmployee(Employee e) {
        employeeDao.add(e);
    }

    @Transactional(readOnly=true)
    public List<Employee> listEmployees() {
        return (ArrayList<Employee>)employeeDao.all();
    }

    @Transactional
    public void updateEmployee(Employee e) {
        employeeDao.update(e);
    }

    @Transactional
    public void deleteEmployee(Employee e) {
        employeeDao.delete(e);
    }

    @Transactional
    public Employee findEmployee(String email) {
        return employeeDao.findByEmail(email);
    }

    @Transactional
    public Employee findEmployeeById(Serializable id) {
        return employeeDao.find(id);
    }
}
