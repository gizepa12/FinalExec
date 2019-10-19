package edu.mum.cs.cs425.eproduct.service.impl;

import edu.mum.cs.cs425.eproduct.model.Product;
import edu.mum.cs.cs425.eproduct.repository.ProductRepository;
import edu.mum.cs.cs425.eproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    @Override
    public void deleteProductById(Long productId) {
            productRepository.deleteById(productId);
    }
}
