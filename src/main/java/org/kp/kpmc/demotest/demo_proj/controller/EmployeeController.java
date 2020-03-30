package org.kp.kpmc.demotest.demo_proj.controller;

import org.kp.kpmc.demotest.demo_proj.model.Employee;
import org.kp.kpmc.demotest.demo_proj.model.Employees;
import org.kp.kpmc.demotest.demo_proj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmployee")
    public List<Employee> getEmployee(){
        System.out.println("Hi friends");
        return employeeService.getEmployees();
    }
    @PostMapping("setEmployee")
    public List<Employee> setEmployee(@RequestBody Employee employee){
        employeeService.setEmployee(employee);
        List<Employee> employeeList=employeeService.getEmployees();
        return employeeList;
    }
    @DeleteMapping("/deleteemployee/{id}")
    void deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
    }
    @GetMapping("/getEmployee/{id}")
    void getEmployeeById(@PathVariable int id) {
        employeeService.findById(id);
    }
    }

