package com.development.employeepayrollapp.controller;

import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class EmpPayrollController {
    @RequestMapping("/get")
    public ResponseEntity<String> getEmployeePayrollData() {
        return new ResponseEntity<String>("Get call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
        return new ResponseEntity<String>("Get call success for id", HttpStatus.OK);
    }
    @PostMapping("/create")
    public  ResponseEntity<String>addEmployeePayrollData(@RequestBody EmpPayrollDTO empPayrollDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for : "+empPayrollDTO, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<String>updateEmployeePayrollData(@RequestBody EmpPayrollDTO empPayrollDTO){
        return new ResponseEntity<String>( "Updated Employee Payroll Data for : "+empPayrollDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{empId}")
        public ResponseEntity<String>deleteEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Delete call success for id:"+empId,HttpStatus.OK);
    }
}
