package com.levelup.spring.dao;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public interface CategoryRepository {

    Category getCategoryById(Long id);

    Category getCategoryByName(String name);

    Long createCategory(Category category);

    void deleteCategory(Category  category);

    Category updateCategory(Category category);

    Long createProduct(Product product);

     void deleteProductById(Long id);

    List<Category> getAllCategories();


    public Category getById(Long id, Class entityClass);

    public Category create(Category object);

    public Category update(Category object);

    public boolean delete(Long id, Class entityClass);

}
