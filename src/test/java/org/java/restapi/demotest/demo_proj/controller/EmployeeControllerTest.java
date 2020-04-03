package org.java.restapi.demotest.demo_proj.controller;

import org.java.restapi.demotest.demo_proj.model.Employee;
import org.java.restapi.demotest.demo_proj.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {
    @InjectMocks
    EmployeeController employeeController;
    @Mock
    EmployeeService employeeService;

    @Test
    public void testGetEmployee(){
        List<Employee> employeeList= employeeController.getEmployee();
        assertNotNull(employeeList);
    }
    @Test
    public void testSetEmployee(){
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("subhasmita");
        List<Employee> employeeList= employeeController.setEmployee(Mockito.any());
        assertNotNull(employeeList);
    }
    @Test
    public void testDeleteEmployee(){
        employeeController.deleteEmployee(Mockito.anyInt());
        assertTrue(Boolean.TRUE);
    }
@Test
    public void testGetEmployeeById() {
    Optional<Employee> emplist=employeeService.getEmployeebyId(Mockito.anyInt());
    assertNotNull(emplist);
}

}
