package com.irmaktekin.employee_service.controller;

import com.irmaktekin.employee_service.model.Employee;
import com.irmaktekin.employee_service.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping
    public Employee add(@RequestBody Employee employee){
        LOGGER.info("Employee add:{} ", employee);
        return  employeeRepository.add(employee);
    }

    @GetMapping
    public Employee findAll(@PathVariable("id")Long id){
        LOGGER.info("Employee find: id={} ", id);
        return  employeeRepository.findById(id);
    }


}
