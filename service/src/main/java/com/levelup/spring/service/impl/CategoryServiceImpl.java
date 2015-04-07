package com.levelup.spring.service.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by java on 07.04.2015.
 */
public class CategoryServiceImpl  implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }

    @Override
    public void createCategory(Category category) {
        categoryRepository.createCategory(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteCategoryById(id);
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.updateCategory(category);
    }

    @Override
    public void createProduct(Product product) {
        categoryRepository.createProduct(product);
    }

    @Override
    public void deleteProductById(Long id) {
        categoryRepository.deleteProductById(id);
    }
}
