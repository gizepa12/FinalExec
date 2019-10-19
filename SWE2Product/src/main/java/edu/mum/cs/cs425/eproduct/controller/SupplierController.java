package edu.mum.cs.cs425.eproduct.controller;

import edu.mum.cs.cs425.eproduct.model.Supplier;
import edu.mum.cs.cs425.eproduct.service.IsupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class SupplierController {

    @Autowired
    private IsupplierService isupplierService;
    @GetMapping(value = "/eMarket/supplier/list")
    public ModelAndView displaySupplierList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("suppliers", isupplierService.suppliers());
        modelAndView.setViewName("supplier/list");
        return modelAndView;
    }


    @GetMapping(value = "/eMarket/supplier/new")
    public String showSupplierForm(Model model){
        model.addAttribute("supplier", new Supplier());
        return "supplier/new";
    }

    @PostMapping(value = "/eMarket/supplier/new")
    public String saveSupplierForm(@Valid @ModelAttribute("supplier") Supplier supplier, Model model, BindingResult bindingResult){

        if (bindingResult.hasErrors()){
            model.addAttribute("error",bindingResult.getAllErrors());

        }

        supplier= isupplierService.saveSupplier(supplier);
        return "redirect:/eMarket/supplier/list";
    }

}
