package com.ciid.shop.service;

import com.ciid.shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    Product product1 = new Product("0", "apple", "fruit");
    Product product2 = new Product("1", "apple-juice", "juice");
    Product product3 = new Product("2", "potato", "vegetablest");


    public List<Product> findAll() {
        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;
    }



}
