package com.atl.task1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("v1/calculator/")
public class Calculator {

    @GetMapping
    public BigDecimal calculator(@RequestParam Double value1,
                                 @RequestParam Double value2,
                                 @RequestParam String operation) {
        if (operation.equalsIgnoreCase(String.valueOf(Operation.ADDITION))) {
            return BigDecimal.valueOf(value1 + value2);
        } else if (operation.equalsIgnoreCase(String.valueOf(Operation.SUBTRACTION))) {
            return BigDecimal.valueOf(value1 - value2);
        } else if (operation.equalsIgnoreCase(String.valueOf(Operation.MULTIPLICATION))) {
            return BigDecimal.valueOf(value1 * value2);
        } else if (operation.equalsIgnoreCase(String.valueOf(Operation.DIVISION))) {
            return BigDecimal.valueOf(value1 / value2);
        }
        return BigDecimal.valueOf(-1);
    }

    enum Operation {
        ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
    }

}
