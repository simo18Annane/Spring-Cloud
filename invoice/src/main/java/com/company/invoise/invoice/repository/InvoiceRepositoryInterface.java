package com.company.invoise.invoice.repository;

import com.company.invoise.core.entity.invoice.Invoice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepositoryInterface extends CrudRepository<Invoice, String> {
}
