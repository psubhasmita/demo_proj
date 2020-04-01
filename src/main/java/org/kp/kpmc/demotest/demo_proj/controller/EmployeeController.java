package org.kp.kpmc.demotest.demo_proj.controller;

import com.sun.javafx.collections.MappingChange;
import org.kp.kpmc.demotest.demo_proj.exception.UserNotFoundException;
import org.kp.kpmc.demotest.demo_proj.model.Employee;
import org.kp.kpmc.demotest.demo_proj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        System.out.println("Hi friends");
        return employeeService.getEmployees();
    }

    @PostMapping("setEmployee")
    public List<Employee> setEmployee(@RequestBody Employee employee) {
        employeeService.setEmployee(employee);
        List<Employee> employeeList = employeeService.getEmployees();
        return employeeList;
    }

    @DeleteMapping("/deleteemployee/{id}")
    void deleteEmployee(@PathVariable int id) {
        employeeService.deleteById(id);
    }

    @GetMapping("/getEmployee/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id) {
        Optional<Employee> emplist=employeeService.getEmployeebyId(id);
        if(emplist.isPresent()){
           return emplist;
        }
        else{
            throw new UserNotFoundException("id-"+id);
        }
    }


    @PutMapping(value = "/updateEmployee/{id}")
    public List<Employee> updateEmployee(@PathVariable(value = "id") int id, @RequestBody Employee employeeList) {
        Optional<Employee> isEmployeeExist = employeeService.getEmployeebyId(id);
        if (!isEmployeeExist.isPresent()) {
            return null;
        }
        employeeList.setId(id);
        employeeService.saveEmployee(employeeList);
        List<Employee> employeeList1 = employeeService.getEmployees();
        System.out.println(employeeService.getEmployees());
        return employeeList1;
    }
    @PatchMapping(value = "updateEmployeeById/{id}")
    public List<Employee> updateEmployeeById(@PathVariable(value = "id") int id, @RequestBody Map<String,Object> empMap)
    {
        Optional<Employee> isEmployeeExist = employeeService.getEmployeebyId(id);
        Employee employee=isEmployeeExist.get();
    }

}
