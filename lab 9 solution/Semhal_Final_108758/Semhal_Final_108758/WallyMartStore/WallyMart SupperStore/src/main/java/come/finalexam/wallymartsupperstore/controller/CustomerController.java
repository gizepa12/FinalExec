package come.finalexam.wallymartsupperstore.controller;

import come.finalexam.wallymartsupperstore.model.Customer;
import come.finalexam.wallymartsupperstore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping(value = "/eCustomers/customer/list")
    public  String getCustomers(Model model){
        Comparator<Customer> comp = (Customer c1,Customer c2) -> c1.getName().compareTo(c2.getName()) ;
        List<Customer> customers = customerService.findAll().stream().sorted(comp).collect(Collectors.toList());

         model.addAttribute("customers", customers);
         return "customer/list";
    }

    @GetMapping(value = "/eCustomer/customer/new")
    public String customerRegistrationForm(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("customers",customerService.findAll());

        return "customer/new";
    }

    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public String registerNewProduct(@Valid @ModelAttribute("customer") Customer customer,
                                     BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "customer/new";
        }
        customerService.save(customer);
        return "redirect:/customer/list";
    }


}
