package com.company.invoise.customer.repository;

import com.company.invoise.core.entity.customer.Address;
import com.company.invoise.core.entity.customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepositoryInterface extends CrudRepository<Address, Long> {
    /*Invoice create(Invoice invoice);
    List<Invoice> list();
    Invoice getById(String number);*/
}
