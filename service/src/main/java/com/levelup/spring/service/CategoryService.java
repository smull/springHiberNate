package com.levelup.spring.service;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;

/**
 * Created by java on 07.04.2015.
 */
public interface CategoryService {

    Category getCategoryById(Long id);

    void createCategory(Category category);

    void deleteCategoryById(Long  id);

    void updateCategory(Category category);

    void createProduct(Product product);

    void deleteProductById(Long id);
}