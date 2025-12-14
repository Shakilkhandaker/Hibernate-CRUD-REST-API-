package com.example.SpringHibernate.CRUD.repository;

import com.example.SpringHibernate.CRUD.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
