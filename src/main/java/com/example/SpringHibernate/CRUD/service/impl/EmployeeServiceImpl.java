package com.example.SpringHibernate.CRUD.service.impl;

import com.example.SpringHibernate.CRUD.dto.EmployeeDto;
import com.example.SpringHibernate.CRUD.entity.Employee;
import com.example.SpringHibernate.CRUD.mapper.EmployeeMapper;
import com.example.SpringHibernate.CRUD.repository.EmployeeRepository;
import com.example.SpringHibernate.CRUD.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public final EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
