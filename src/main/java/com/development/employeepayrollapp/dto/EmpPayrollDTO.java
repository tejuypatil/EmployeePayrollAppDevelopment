package com.development.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

;
public class EmpPayrollDTO {
    @NotEmpty(message = "Employee cannot be null")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name Invalid")

    public String name;
    @Min(value = 500,message = "Min Wage should be more than 500")
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

