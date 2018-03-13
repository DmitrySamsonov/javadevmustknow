package com.ciid.shop.controller;

import com.ciid.shop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
    public String getPage() {
        return "addCategory.html";
    }


    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public String insert(@RequestBody String param) {
        String categoryName = param;
        categoryService.insert(categoryName);
        return "addProduct.html";
    }


}
