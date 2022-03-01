package com.atl.task1.dao.model;


import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private Long id;
    private String address;


    public Customer(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    public static List<Customer> customers(){
        return List.of(new Customer(1L,"Baki"),new Customer(2L,"Gence"),new Customer(3L,"Sumqayit"));
    }
}
