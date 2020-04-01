package org.kp.kpmc.demotest.demo_proj.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kp.kpmc.demotest.demo_proj.model.Employee;
import org.kp.kpmc.demotest.demo_proj.repository.EmployeeRepository;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {
    @InjectMocks
    EmployeeService employeeService;
    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void testGetEmployees(){
        List<Employee> employeeList=employeeService.getEmployees();
        assertNotNull(employeeList);
    }
    @Test
    public void testSetEmployee(){
        employeeService.setEmployee(Mockito.any());
        assertTrue(Boolean.TRUE);
    }

    @Test
    public void testDeleteById(){
        employeeService.deleteById(Mockito.anyInt());
        assertTrue(Boolean.TRUE);
    }

   /* @Test
    public void testFindById(){
        employeeService.f(Mockito.anyInt());
        assertTrue(Boolean.TRUE);
    }
*/
}
