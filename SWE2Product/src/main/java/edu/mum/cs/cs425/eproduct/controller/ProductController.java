package edu.mum.cs.cs425.eproduct.controller;

import edu.mum.cs.cs425.eproduct.model.Product;
import edu.mum.cs.cs425.eproduct.model.Supplier;
import edu.mum.cs.cs425.eproduct.service.IsupplierService;
import edu.mum.cs.cs425.eproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private IsupplierService isupplierService;


    @GetMapping(value = "/eMarket/product/list")
    public ModelAndView displayProductList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", productService.getAllProducts());
        modelAndView.setViewName("product/list");
        return modelAndView;
    }
    @GetMapping(value = "/eMarket/product/new")
    public String showProductForm(Model model){

        List<Supplier> suppliers = isupplierService.suppliers();
        model.addAttribute("suppliers",suppliers);
        model.addAttribute("product", new Product());
        return "product/new";
    }

    @PostMapping("eMarket/product/new")
    public String returnView(@Valid @ModelAttribute("product") Product product, Model model, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            model.addAttribute("error",bindingResult.getAllErrors());
        }
        product=productService.saveProduct(product);
        return "redirect:/product/list";
    }




}
