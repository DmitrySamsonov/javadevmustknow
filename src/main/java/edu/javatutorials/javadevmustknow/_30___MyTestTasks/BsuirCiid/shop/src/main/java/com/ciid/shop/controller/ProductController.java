package com.ciid.shop.controller;

import com.ciid.shop.model.Product;
import com.ciid.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService shopService;

    @RequestMapping("/")
    public String startPage() {
        return "displayProducts.html";
    }

    @ResponseBody
    @RequestMapping("/api/getAllProducts")
    public List<Product> getProductList() {
        return shopService.findAll();
    }


}
