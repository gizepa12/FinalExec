package edu.mum.cs.cs425.eproduct.service;

import edu.mum.cs.cs425.eproduct.model.Product;
import edu.mum.cs.cs425.eproduct.model.Supplier;

import java.util.List;

public interface ProductService {

     List<Product> getAllProducts();
     Product saveProduct(Product product);
     Product getProductById(Long productId);
     void deleteProductById(Long productId);

    //public abstract List<Supplier> searchProducts(String searchString);

}
