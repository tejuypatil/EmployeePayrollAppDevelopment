package com.development.employeepayrollapp.controller;


import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import com.development.employeepayrollapp.dto.ResponseDTO;
import com.development.employeepayrollapp.exceptions.EmployeeePayrollException;
import com.development.employeepayrollapp.model.EmpPayrollData;
import com.development.employeepayrollapp.service.EmpPayrollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class EmpPayrollController {
    @Autowired
    public EmpPayrollService empPayrollService;

    @RequestMapping("/payroll")
    public ResponseEntity getEmployeePayrollData() {
        ArrayList<EmpPayrollData> empPayrollDataArrayList = empPayrollService.getAll();
        ResponseDTO responseDTO = new ResponseDTO("Get All call success", empPayrollDataArrayList);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }

    @GetMapping("/payroll/{id}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("id") int id) throws EmployeeePayrollException {
        EmpPayrollData empPayrollData = empPayrollService.get(1);
        ResponseDTO responseDTO = new ResponseDTO("Get call success", empPayrollData);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }

    @PostMapping("/payroll")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmpPayrollDTO empPayrollDTO) {
        EmpPayrollData empPayrollData = empPayrollService.create(empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get call success", empPayrollData);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }

    @PutMapping("/payroll/{id}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable("id") int id, @RequestBody EmpPayrollDTO empPayrollDTO) throws EmployeeePayrollException {
        EmpPayrollData empPayrollData = empPayrollService.update(id, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Get call success", empPayrollData);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/payroll/{id}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("id") int id) throws EmployeeePayrollException {
        empPayrollService.delete(id);
        ResponseDTO responseDTO = new ResponseDTO("Deleted", null);
        ResponseEntity<ResponseDTO> response = new ResponseEntity<>(responseDTO, HttpStatus.OK);
        return response;
    }
}
