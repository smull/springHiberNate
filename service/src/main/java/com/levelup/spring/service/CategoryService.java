package com.levelup.spring.service;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public interface CategoryService {

    Category getCategoryById(Long id);

    Category createCategory(String name);

    void deleteCategoryById(Long  id);

    Category updateCategory(String name);

    void createProduct(Product product);

    void deleteProductById(Long id);

    List<Category> getAllCategories();
}
