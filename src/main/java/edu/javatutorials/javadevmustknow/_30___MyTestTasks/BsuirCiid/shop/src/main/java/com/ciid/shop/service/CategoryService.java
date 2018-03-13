package com.ciid.shop.service;

import com.ciid.shop.dao.CategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    public void insert(String categoryName){
        categoryDao.insert(categoryName);
    }
}
