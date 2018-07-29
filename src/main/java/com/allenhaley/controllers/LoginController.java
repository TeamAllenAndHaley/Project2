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

    @GetMapping(path="test")
    public void testMappings() {
        System.out.println("test worked");
    }

    @PostMapping(path="auth",produces={MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, consumes="application/json")
    public ResponseEntity<Employee> findUser(@RequestBody Login login, HttpServletResponse response) {
        System.out.println("test");
        Employee employee = employeeService.findEmployee(login.getEmail());
        if(employee.getPassword().equals(login.getPassword())) {
            response.setHeader("Location","http://localhost:4200");
            return new ResponseEntity<>(employee,HttpStatus.OK);
        }
        return new ResponseEntity<>((Employee)null,HttpStatus.BAD_REQUEST);
    }

}
