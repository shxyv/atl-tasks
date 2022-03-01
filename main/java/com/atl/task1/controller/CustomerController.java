package com.atl.task1.controller;

import com.atl.task1.dao.model.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/customers")
public class CustomerController {

    @PatchMapping("/{id}/")
    public void updateCustomer(@PathVariable Long id, @RequestParam(name = "value") String address){
        Customer.customers()
                .stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                .get()
                .setAddress(address);
    }

    @GetMapping
    public List<Customer> getCustomers(){
        return Customer.customers();
    }
}
