package com.emre.springdemo.services;

import com.emre.springdemo.entity.Product;
import com.emre.springdemo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> getAllProducts(){
        return  productRepository.getAllProducts();
    }

    public Product getProductById(String id){
        return productRepository.getProductById(id);
    }

    public Product addProduct(Product product){
        return productRepository.addProduct(product);
    }

    public boolean deleteProduct(String id){
        return productRepository.DeleteProduct(id);
    }

}
