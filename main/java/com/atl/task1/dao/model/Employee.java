package com.atl.task1.dao.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Data
public class Employee {

    private final Salary salary;
    private String name;

    public Employee(Salary salary) {
        this.salary = salary;
    }

    public String getName() {
        return "Ilqar";
    }

    public BigDecimal getSalary() {
        return salary.getAmount();
    }
}
