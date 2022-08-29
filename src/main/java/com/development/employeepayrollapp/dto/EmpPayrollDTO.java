package com.development.employeepayrollapp.dto;

import lombok.Data;

@Data
public class EmpPayrollDTO {
    public static String name;
    public long salary;

    public EmpPayrollDTO(String name, long salary) {
        this.name= name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", salary=" + salary;
    }
}
