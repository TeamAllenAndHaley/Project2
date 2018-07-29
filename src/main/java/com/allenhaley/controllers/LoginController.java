package com.allenhaley.controllers;

import com.allenhaley.model.Employee;
import com.allenhaley.model.Login;
import com.allenhaley.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(path="/login")
@ResponseBody
public class LoginController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path="/test",produces=MediaType.APPLICATION_JSON_VALUE)
    public void testMappings(HttpServletResponse response) {
        System.out.println("test");
//        response.setStatus(200);
//        return response;
    }

    @CrossOrigin
    @PostMapping(path="/auth",produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes="application/json")
    public ResponseEntity<Employee> findUser(@RequestBody Login login) {
        Employee employee = employeeService.findEmployee(login.getEmail());
        if(employee.getPassword().equals(login.getPassword())) {
            return new ResponseEntity<>(employee, HttpStatus.OK);
        }
        return new ResponseEntity<>((Employee)null,HttpStatus.BAD_REQUEST);
    }

    @CrossOrigin
    @PostMapping(path="/new",produces={MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_ATOM_XML_VALUE}, consumes="application/json")
    public ResponseEntity<Login> isNewUser(@RequestBody Login login) {
        Employee employee = employeeService.findEmployee(login.getEmail());
        if(employee.getPassword() == null) {
            employee.setPassword("test");
            Login l = new Login();
            l.setEmail(employee.getEmail());
            l.setPassword(employee.getPassword());
            return new ResponseEntity<>(login, HttpStatus.OK);
        } else return new ResponseEntity<>((Login)null,HttpStatus.BAD_REQUEST);
    }

}
