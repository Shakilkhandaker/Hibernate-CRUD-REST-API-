package com.example.SpringHibernate.CRUD.controler;

import com.example.SpringHibernate.CRUD.dto.EmployeeDto;
import com.example.SpringHibernate.CRUD.service.EmployeeService;
import com.example.SpringHibernate.CRUD.service.impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;


    //Build add Employye Rest ApI
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee = employeeService.createEmployee((employeeDto));
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);

    }

}
