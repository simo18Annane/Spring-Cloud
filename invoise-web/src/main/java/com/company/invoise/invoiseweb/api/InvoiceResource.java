package com.company.invoise.invoiseweb.api;

import com.company.invoise.core.entity.invoice.Invoice;
import com.company.invoise.core.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //toute les sorties doivent être converties
@RequestMapping("/invoice")
public class InvoiceResource {

    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping
    public Invoice create(@RequestBody Invoice invoice) {

        return invoiceService.createInvoice(invoice);
    }

    @GetMapping
    public Iterable<Invoice> list() {
        System.out.println("La méthode display Home a été invoquée");

        return invoiceService.getInvoiceList();
    }

    @GetMapping("/{id}")
    public Invoice get(@PathVariable("id") String number) {
        System.out.println("La méthode displayInvoice a été invoquée");

        return invoiceService.getInvoiceByNumber(number);
    }
/*
    @GetMapping("/create-form")
    public String displayInvoiceCreateForm(@ModelAttribute InvoiceForm invoice){
        return "invoice-create-form";
    }
*/
    /*
    @RequestMapping("/invoice-home")
    public String displayHome(HttpServletRequest request) {
        System.out.println("La méthode display Home a été invoquée");
        List<Invoice> invoices = invoiceService.getInvoiceList();
        request.setAttribute("invoices", invoices);
        return "index";
    }*/
/*
    @RequestMapping("/home")
    public ModelAndView displayHome() {
        System.out.println("La méthode display Home a été invoquée");
        ModelAndView mv = new ModelAndView("invoice-home");
        mv.addObject("invoices", invoiceService.getInvoiceList());
        return mv;
    }

    @RequestMapping("/{id}")
    public ModelAndView displayInvoice(@PathVariable("id") String number) {
        System.out.println("La méthode displayInvoice a été invoquée");
        ModelAndView mv = new ModelAndView("invoice-details");
        mv.addObject("invoice", invoiceService.getInvoiceByNumber(number));
        //List<Invoice> invoices = invoiceService.getInvoiceList();
        return mv;
    }*/
}
