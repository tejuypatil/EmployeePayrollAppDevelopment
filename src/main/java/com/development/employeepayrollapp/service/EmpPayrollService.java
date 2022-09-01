package com.development.employeepayrollapp.service;

import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import com.development.employeepayrollapp.exceptions.EmployeeePayrollException;
import com.development.employeepayrollapp.model.EmpPayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class EmpPayrollService {
    private final AtomicLong counter = new AtomicLong();
    private ArrayList<EmpPayrollData> dataList = new ArrayList<>();

    public EmpPayrollData get(long id) throws EmployeeePayrollException {
        EmpPayrollData empPayrollData = dataList.stream().filter(empPayrollData1 -> empPayrollData1.getId()==id).findFirst().orElseThrow(() -> new EmployeeePayrollException("Employee id not present"));
        return empPayrollData;
    }
    public EmpPayrollData create(EmpPayrollDTO empPayrollDTO) {
        EmpPayrollData empPayrollData = new EmpPayrollData(counter.incrementAndGet(), empPayrollDTO);
        dataList.add(empPayrollData);
        return empPayrollData;
    }

    public EmpPayrollData update(long id,EmpPayrollDTO empPayrollDTO) throws EmployeeePayrollException {
        EmpPayrollData empPayrollData = dataList.stream().filter(empPayrollData1 -> empPayrollData1.getId()==id).findFirst().orElseThrow(() -> new EmployeeePayrollException("Employee not found"));
        empPayrollData.setName(empPayrollDTO.name);
        empPayrollData.setSalary(empPayrollDTO.salary);
        return empPayrollData;
    }

    public ArrayList<EmpPayrollData> getAll() {

        return dataList;
    }
    public void delete(long id) throws EmployeeePayrollException {
        EmpPayrollData empPayrollData = dataList.stream().filter(empPayrollData1 -> empPayrollData1.getId()==id).findFirst().orElseThrow( () -> new EmployeeePayrollException("Employee data not available"));
        dataList.remove(empPayrollData);
    }
}
