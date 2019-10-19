package edu.mum.cs.cs425.esupermarket.service;

import edu.mum.cs.cs425.esupermarket.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product saveProduct(Product product);
    Product getProductById(Long productId);
    void deleteProductById(Long productId);

}
