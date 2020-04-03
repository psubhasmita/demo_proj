package org.java.restapi.demotest.demo_proj.repository;

import org.java.restapi.demotest.demo_proj.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
}
