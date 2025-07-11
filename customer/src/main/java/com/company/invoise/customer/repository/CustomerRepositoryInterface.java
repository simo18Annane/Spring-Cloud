package com.company.invoise.customer.repository;

import com.company.invoise.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryInterface extends CrudRepository<Customer, Long> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
