package com.levelup.spring.service.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Service("categoryService")
public class CategoryServiceImpl  implements CategoryService{

    @Resource(name = "categoryRepository")
    CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.getCategoryById(id);
    }

    @Override
    public Category createCategory(String name) {
       return categoryRepository.createCategory(name);
    }

    @Override
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteCategoryById(id);
    }

    @Override
    public Category updateCategory(String name) {
        return categoryRepository.updateCategory(name);
    }

    @Override
    public void createProduct(Product product) {
        categoryRepository.createProduct(product);
    }

    @Override
    public void deleteProductById(Long id) {
        categoryRepository.deleteProductById(id);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }


}
