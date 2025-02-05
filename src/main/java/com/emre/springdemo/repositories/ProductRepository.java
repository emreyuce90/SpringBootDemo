package com.emre.springdemo.repositories;

import com.emre.springdemo.entity.Product;
import com.emre.springdemo.entity.ProductUpdateDto;
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

    public Product updateProduct(String id, ProductUpdateDto productUpdateDto) {
        // eşleşen kaydı bul
       Product oldProduct = getProductById(id);
       // gerekli güncellemeleri yap
       oldProduct.setName(productUpdateDto.getName());
       oldProduct.setPrice(productUpdateDto.getPrice());
       oldProduct.setQuantity(productUpdateDto.getQuantity());
       // Güncellenen productı döndür
       return new Product(id,productUpdateDto.getName(),productUpdateDto.getPrice(),productUpdateDto.getQuantity());
    }

}
