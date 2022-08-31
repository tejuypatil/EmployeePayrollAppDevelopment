package com.development.employeepayrollapp.service;

import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import com.development.employeepayrollapp.dto.ResponseDTO;
import com.development.employeepayrollapp.model.EmpPayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpPayrollService {
  public EmpPayrollData get(long id){
      EmpPayrollDTO empPayrollDTO = new EmpPayrollDTO("Sonu",8000);
      EmpPayrollData empPayrollData = new EmpPayrollData(id,empPayrollDTO);
      return empPayrollData;

  }
  public  EmpPayrollData create(EmpPayrollDTO empPayrollDTO){
      EmpPayrollData empPayrollData = new EmpPayrollData(1,empPayrollDTO);
      return empPayrollData;
  }
  public EmpPayrollData update(EmpPayrollDTO empPayrollDTO){
      EmpPayrollData empPayrollData = new EmpPayrollData(1,empPayrollDTO);
      return empPayrollData;
  }
public ArrayList<EmpPayrollData>  getAll(){
    ArrayList<EmpPayrollData> empPayrollDataArrayList = new ArrayList<>();
    EmpPayrollDTO empPayrollDTO = new EmpPayrollDTO("Teju",10000);
    EmpPayrollData empPayrollData = new EmpPayrollData(1,empPayrollDTO);
    empPayrollDataArrayList.add(empPayrollData);
    return empPayrollDataArrayList;
}
public void delete(long id){
    EmpPayrollDTO empPayrollDTO = new EmpPayrollDTO("Sonu",8000);
    EmpPayrollData empPayrollData = new EmpPayrollData(id,empPayrollDTO);
  }
}
