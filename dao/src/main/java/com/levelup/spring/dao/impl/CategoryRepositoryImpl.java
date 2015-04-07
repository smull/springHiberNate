package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public class CategoryRepositoryImpl  implements CategoryRepository{

    List<Category> categoryList;


    @Override
    public Category getCategoryById(Long id) {
        Category categoryB = new Category();
        for (Category category : categoryList) {
            if(category.getId().equals(id))
               categoryB = category;
        }
        return categoryB;
    }

    @Override
    public void createCategory(Category category) {
        categoryList.add(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        for (Category category : categoryList) {
            if(category.getId().equals(id))
                categoryList.remove(category);
        }
    }

    @Override
    public void updateCategory(Category category) {
        if(!categoryList.contains(category))
            categoryList.add(category);
    }


    @Override
    public void deleteProductById(Long id) {


    }

    @Override
    public void createProduct(Product product) {

    }

}
