package edu.mum.cs.cs425.walmart.controller;

import edu.mum.cs.cs425.walmart.model.Customer;
import edu.mum.cs.cs425.walmart.service.ServiceImplamention.CustomerImplamention;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerImplamention customerImplamention;

    @GetMapping(value = "eWalmart/customer/list")
    public ModelAndView displayCustomerList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("customers", customerImplamention.getAllCustomers());
        modelAndView.setViewName("customer/list");
        return modelAndView;
    }

    @GetMapping (value = "/eWalmart/customer/new")
    public String showCustomerForm(Model model){

        List<Customer> customers = customerImplamention.getAllCustomers();
       // model.addAttribute("customer",Customer);
        model.addAttribute("customer", new Customer());
        return "customer/new";
    }

    @PostMapping("eWalmart/customer/new")
    public String returnView(@Valid @ModelAttribute("customer") Customer customer, Model model, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            model.addAttribute("error",bindingResult.getAllErrors());
           // return "customer/new";
        }
        customer=customerImplamention.saveCustomer(customer);
        return "redirect:/eWalmart/customer/list";
    }

}
