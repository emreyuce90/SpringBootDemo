package com.emre.springdemo.controllers;




import com.emre.springdemo.entity.Product;
import com.emre.springdemo.entity.ProductUpdateDto;
import com.emre.springdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/products/")

public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping(path="")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path ="{id}" )
    public Product getProductById(@PathVariable(name = "id") String id) {
        return productService.getProductById(id);
    }

    @PostMapping(path = "")
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("{id}")
    public boolean deleteProduct(@PathVariable(name = "id") String id) {
        return productService.deleteProduct(id);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable(name = "id") String id, @RequestBody ProductUpdateDto productUpdateDto) {
        return productService.UpdateProduct(id,productUpdateDto);
    }

}
