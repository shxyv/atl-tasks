package com.atl.task1.dao.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Salary {

    public BigDecimal getAmount() {
        return new BigDecimal(1000);
    }
}
