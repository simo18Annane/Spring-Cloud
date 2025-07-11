package com.company.invoise.invoice.controller;

import com.company.invoise.core.entity.invoice.Invoice;
import com.company.invoise.invoice.service.InvoiceServiceInterface;

public interface InvoiceControllerInterface {
    String createInvoice(Invoice invoice);
    void setInvoiceService(InvoiceServiceInterface invoiceService);
}
