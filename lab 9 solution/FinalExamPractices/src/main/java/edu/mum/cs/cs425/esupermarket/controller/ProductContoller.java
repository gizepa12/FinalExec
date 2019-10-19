package edu.mum.cs.cs425.esupermarket.controller;

        import edu.mum.cs.cs425.esupermarket.model.Product;
        import edu.mum.cs.cs425.esupermarket.model.Supplier;
        import edu.mum.cs.cs425.esupermarket.service.ProductService;
        import edu.mum.cs.cs425.esupermarket.service.SupplierService;
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
public class ProductContoller {

    @Autowired
    private ProductService productService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping(value = "/esuperMarket/product/list")
    public ModelAndView displayProductList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("products", productService.getAllProducts());
        modelAndView.setViewName("product/list");
        return modelAndView;
    }

    @GetMapping(value = "esuperMarket/product/new")
    public String AddNewProduct(Model model) {
        List<Supplier> suppliers = supplierService.suppliers();
        model.addAttribute("suppliers", suppliers);
        model.addAttribute("product", new Product());
        return "product/new";


    }

    @PostMapping("esuperMarket/product/new")
    public String returnNewProduct(@Valid @ModelAttribute("product") Product product, Model model, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("error", bindingResult.getAllErrors());
        }
        product = productService.saveProduct(product);
        return "redirect:/product/list";
    }
}
