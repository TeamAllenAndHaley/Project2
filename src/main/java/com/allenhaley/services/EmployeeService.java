package com.allenhaley.services;

import com.allenhaley.dao.BaseDao;
import com.allenhaley.model.Employee;
import com.allenhaley.model.Housing;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    BaseDao<Employee> employeeDao;

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
}