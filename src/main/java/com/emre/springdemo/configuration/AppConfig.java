package com.emre.springdemo.configuration;

import com.emre.springdemo.entity.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<Product> getAllProducts(){
        List<Product> products = new ArrayList<>();
        products.add(new Product("ftpy7e2idvtMDQA3E1XOWeNK","Apple IPhone XS Max",68.345,250));
        products.add(new Product("rOSbdKnaxpoEohmYeXVd7Ihc","Xiaomi Note 10 Lite" ,8.350,150));
        products.add(new Product("edT3cI4dOmLCGNJztP7ZNh0h","Oppo A1",34.234,100));
        products.add(new Product("wtnApvBn3fBzCvqdjSYzvEkF","Samsung Galaxy S10",65.234,129));

        return products;
    }

}
