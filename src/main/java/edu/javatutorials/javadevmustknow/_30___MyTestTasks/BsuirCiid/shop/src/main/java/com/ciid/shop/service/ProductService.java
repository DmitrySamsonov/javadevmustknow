package com.ciid.shop.service;

import com.ciid.shop.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    Product product = new Product("0", "apple", "fruit");


    public List<Product> findAll() {
        List<Product> productList = new ArrayList<Product>();
        productList.add(product);
        return productList;
    }



}
