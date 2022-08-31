package com.development.employeepayrollapp.controller;


import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import com.development.employeepayrollapp.dto.ResponseDTO;
import com.development.employeepayrollapp.model.EmpPayrollData;
import com.development.employeepayrollapp.service.EmpPayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpPayrollController {
    @Autowired
    public EmpPayrollService empPayrollService;
    @RequestMapping("/payroll")
    public ResponseEntity getEmployeePayrollData() {
        ArrayList<EmpPayrollData> empPayrollDataArrayList= empPayrollService.getAll();
        ResponseDTO responseDTO = new ResponseDTO("Get call success",empPayrollDataArrayList);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO,HttpStatus.OK);
        return response;
    }
    @GetMapping("/payroll/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmpPayrollData empPayrollData = empPayrollService.get(1);
        ResponseDTO responseDTO = new ResponseDTO("Get call success",empPayrollData);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO,HttpStatus.OK);
        return response;
    }
    @PostMapping("/payroll")
    public  ResponseEntity<ResponseDTO>addEmployeePayrollData(@RequestBody EmpPayrollDTO empPayrollDTO) {
        EmpPayrollData empPayrollData= empPayrollService.create(empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get call success",HttpStatus.OK);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO,HttpStatus.OK);
        return response;
    }
    @PutMapping("/payroll")
    public ResponseEntity<ResponseDTO>updateEmployeePayrollData(@RequestBody EmpPayrollDTO empPayrollDTO){
        EmpPayrollData empPayrollData = empPayrollService.update(empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get call success",empPayrollData);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO,HttpStatus.OK);
        return response;
    }
    @DeleteMapping("/payroll/{empId}")
        public ResponseEntity<ResponseDTO>deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted", null);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }
}
