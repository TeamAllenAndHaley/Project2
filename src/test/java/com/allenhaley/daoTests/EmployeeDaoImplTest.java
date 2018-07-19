package com.allenhaley.daoTests;

import com.allenhaley.config.HibernateConfigUtil;
import com.allenhaley.dao.EmployeeDao;
import com.allenhaley.dao.EmployeeDaoImpl;
import com.allenhaley.model.Employee;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmployeeDaoImplTest {

    EmployeeDao ed;

    @Before
    public void init() {
        ed = new EmployeeDaoImpl();
    }

//    @Test
//    public void addMethodShouldAddEmployeeAndReturnNewEmployee() throws ParseException {
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        Date d = sdf.parse("08/20/1994");
//
//        Employee e = new Employee();
//        e.setfName("Haley");
//        e.setlName("Hodges");
//        e.setdOfBirth(d);
//        e.setEmail("testemail1234@gmail.com");
//        e.setHasKeys(true);
//        e.setHasCar(true);
//        e.setEmailSubbed(false);
//
//        Employee test = ed.add(e);
//        long id = test.getEmpId();
//
//        Assert.assertEquals("Id should equal 3.",3L,id);
//    }

    @Test
    public void findAllShouldReturnListOfEmployees() {
        List<Employee> employees = (List<Employee>)ed.all();
        Employee e = employees.get(0);
        long id = e.getEmpId();
        Assert.assertEquals("Id should equal 1",1,id);
    }

}
