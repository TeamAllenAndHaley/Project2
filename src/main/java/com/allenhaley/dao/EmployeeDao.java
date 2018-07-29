package com.allenhaley.dao;

import com.allenhaley.model.Employee;

public interface EmployeeDao extends BaseDao<Employee> {
    public Employee findByEmail(String email);
}
