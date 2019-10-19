package come.finalexam.wallymartsupperstore.controller;

import come.finalexam.wallymartsupperstore.model.Customer;
import come.finalexam.wallymartsupperstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class PrimeCustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping(value = "/primes")
    public  String gerPrimeCustomers(Model model){
        Comparator<Customer> comp = (Customer c1, Customer c2) -> c1.getDateOfBirth().compareTo(c2.getDateOfBirth()) ;
        List<Customer> customersList = customerService.findAll().stream().sorted(comp).collect(Collectors.toList());

        List<Customer> customers = new ArrayList<>();
        LocalDate now = LocalDate.now();
        for(Customer c : customersList){
            LocalDate dob = c.getDateOfBirth();
            double age = now.getYear() - dob.getYear();
            if(age >= 40){
                customers.add(c);
            }
            model.addAttribute("customers", customers);
        }
        return "customer/prime";
    }

}
