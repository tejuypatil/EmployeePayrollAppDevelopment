package com.development.employeepayrollapp.model;

import com.development.employeepayrollapp.dto.EmpPayrollDTO;
public class EmpPayrollData {

    private String name;
    private long salary;
    private Long id;


    public EmpPayrollData(long employeeId, EmpPayrollDTO empPayrollDTO) {
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
        this.id = employeeId;
    }

    public EmpPayrollData() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
