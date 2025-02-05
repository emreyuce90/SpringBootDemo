package com.emre.springdemo.repositories;

import com.emre.springdemo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    private List<Product> getAllProducts;

    public List<Product> getAllProducts() {
        return getAllProducts;
    }

    public Product getProductById(String  id) {
        return getAllProducts.stream().filter(product -> product.getId().equals(id)).findFirst().orElse(null);
    }

    public Product addProduct(Product product) {
        getAllProducts.add(product);
        return product;
    }

    public boolean DeleteProduct(String id) {
        return getAllProducts.removeIf(product -> product.getId().equals(id));
    }

}
