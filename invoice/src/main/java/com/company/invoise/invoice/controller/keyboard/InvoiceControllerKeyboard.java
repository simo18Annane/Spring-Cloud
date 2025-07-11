package com.company.invoise.invoice.controller.keyboard;

import com.company.invoise.invoice.controller.InvoiceControllerInterface;
import com.company.invoise.core.entity.customer.Customer;
import com.company.invoise.core.entity.invoice.Invoice;

import com.company.invoise.invoice.service.InvoiceServiceInterface;

import java.util.Scanner;

//@Controller
public class InvoiceControllerKeyboard implements InvoiceControllerInterface {

    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    public String createInvoice(Invoice invoice) {
        System.out.println( "What is the customer name?" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        invoice = new Invoice();
        Customer customer = new Customer(customerName);
        invoice.setCustomer(customer);

        invoiceService.createInvoice(invoice);
        return null;
    }
}
