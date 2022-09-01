package com.development.employeepayrollapp.dto;
;
public class EmpPayrollDTO {

    public String name;
    public long salary;


    public EmpPayrollDTO(String name, long salary) {
        this.name= name;
        this.salary = salary;
    }
    public EmpPayrollDTO() {

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;
    }

}

