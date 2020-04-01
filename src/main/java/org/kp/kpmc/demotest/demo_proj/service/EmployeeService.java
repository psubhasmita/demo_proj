package org.kp.kpmc.demotest.demo_proj.service;

import org.kp.kpmc.demotest.demo_proj.model.Employee;
import org.kp.kpmc.demotest.demo_proj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    /*private static Employees employees=new Employees();
    static{
        employees.getEmployeeList().add(new Employee(1,"soma",10000));
        employees.getEmployeeList().add(new Employee(2,"subha",10000));
        employees.getEmployeeList().add(new Employee(3,"smita",10000));
    }*/
    public List<Employee> getEmployees() {

        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeebyId(int id) {

        return employeeRepository.findById(id);
    }

    public void setEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

    public void saveEmployee(Employee employeeList) {
        employeeRepository.save(employeeList);
    }

}
