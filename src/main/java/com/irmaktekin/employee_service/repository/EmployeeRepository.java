package com.irmaktekin.employee_service.repository;

import com.irmaktekin.employee_service.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {
    private List<Employee> employeeList = new ArrayList<>();

    public Employee add(Employee employee){
        employeeList.add(employee);
        return employee;
    }

    public Employee findById(Long id){
        return employeeList.stream()
                .filter(employee -> employee.id().equals(id))
                .findFirst()
                .orElseThrow();
    }
    public List <Employee> findAll(){
        return employeeList;
    }
    public  List<Employee> findByDepartment(Long departmentId){
        return employeeList.stream().filter(a->a.departmentId().equals(departmentId))
                .toList();
    }

}
