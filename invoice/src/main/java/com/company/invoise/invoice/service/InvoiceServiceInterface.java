package com.company.invoise.invoice.service;

import com.company.invoise.core.entity.invoice.Invoice;
import com.company.invoise.invoice.repository.InvoiceRepositoryInterface;

public interface InvoiceServiceInterface {
    Invoice createInvoice(Invoice invoice);
    Iterable<Invoice> getInvoiceList();
    Invoice getInvoiceByNumber(String number);
    void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository);
}
