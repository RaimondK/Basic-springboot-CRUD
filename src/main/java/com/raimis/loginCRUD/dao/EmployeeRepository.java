package com.raimis.loginCRUD.dao;

import com.raimis.loginCRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Testing
    public List<Employee> findAllByOrderByIdAsc();
}