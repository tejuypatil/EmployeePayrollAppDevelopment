package com.development.employeepayrollapp.service;

import com.development.employeepayrollapp.dto.EmpPayrollDTO;
import com.development.employeepayrollapp.model.EmpPayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class EmpPayrollService {
    private ArrayList<EmpPayrollData> dataList = new ArrayList<>();

    public EmpPayrollData get(long id) {
        EmpPayrollData empPayrollData = dataList.get((int)(id-1));
        return empPayrollData;
    }
    public EmpPayrollData create(EmpPayrollDTO empPayrollDTO) {
        EmpPayrollData empPayrollData = new EmpPayrollData(1, empPayrollDTO);
        dataList.add(empPayrollData);
        return empPayrollData;
    }

    public EmpPayrollData update(long id,EmpPayrollDTO empPayrollDTO) {
        EmpPayrollData empPayrollData = dataList.get((int) (id-1));
        empPayrollData.setName(empPayrollDTO.name);
        empPayrollData.setSalary(empPayrollDTO.salary);
        return empPayrollData;
    }

    public ArrayList<EmpPayrollData> getAll() {

        return dataList;
    }
    public void delete(long id) {
       dataList.remove((int)(id-1));
    }
}
