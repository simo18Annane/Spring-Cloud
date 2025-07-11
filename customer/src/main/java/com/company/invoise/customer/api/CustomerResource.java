package com.company.invoise.customer.api;

import com.company.invoise.core.entity.customer.Customer;
import com.company.invoise.customer.repository.CustomerRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController //toute les sorties doivent être converties
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerRepositoryInterface customerRepository;

    @GetMapping("/{id}")
    public Customer get(@PathVariable("id") Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public CustomerRepositoryInterface getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepositoryInterface customerRepository) {
        this.customerRepository = customerRepository;
    }
}
