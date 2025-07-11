package com.company.invoise.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceControllerWeb {
/*
    @Autowired
    private InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("/create")
    public String createInvoice(@Valid @ModelAttribute InvoiceForm invoiceForm, BindingResult results) {
        if (results.hasErrors()) {
            return "invoice-create-form";
        }
        Invoice invoice = new Invoice();
        Customer customer = new Customer(invoiceForm.getCustomerName());
        invoice.setCustomer(customer);
        Address address = new Address(invoiceForm.getStreetName(), invoiceForm.getStreetNumber(), invoiceForm.getCity(), invoiceForm.getZipCode(), invoiceForm.getCountry());
        customer.setAddress(address);
        invoice.setOrderNumber(invoiceForm.getOrderNumber());
        invoiceService.createInvoice(invoice);
        return "invoice-created";
    }
*/
    @GetMapping("/home")
    public String displayHome(Model model) {
        System.out.println("La méthode display Home a été invoquée");
        //model.addAttribute("invoices", invoiceService.getInvoiceList());//
        return "invoice-home";
    }
/*
    @GetMapping("/{id}")
    public String displayInvoice(@PathVariable("id") String number, Model model) {
        System.out.println("La méthode displayInvoice a été invoquée");
        model.addAttribute("invoice", invoiceService.getInvoiceByNumber(number));
        //List<Invoice> invoices = invoiceService.getInvoiceList();
        return "invoice-details";
    }
*/
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
