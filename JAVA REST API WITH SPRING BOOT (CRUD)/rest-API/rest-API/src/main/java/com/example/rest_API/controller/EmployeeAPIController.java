package com.example.rest_API.controller;

import com.example.rest_API.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeAPIController {

    Employee employee;
    @GetMapping("{employeeId}")
    public Employee getEmployeeDetails(Integer employeeId){
        return  employee; //new Employee(1,"Alex","alex@gmail.com","xxxxxxxxxx");
    }

    @PostMapping
    public String createEmployeeDetails(@RequestBody Employee employee){
        this.employee = employee;
        return "Employee Created Successfully!";

    }


    @PutMapping
    public String updateEmployeeDetails(@RequestBody Employee employee){
        this.employee = employee;
        return "Employee Updated Successfully!";

    }


    @DeleteMapping("{employeeId}")
    public String deleteEmployeeDetails(Integer employeeId){
        this.employee = null;
        return "Employee Deleted Successfully!";

    }



}
