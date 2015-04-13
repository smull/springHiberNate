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
    public Long createCategory(Category category) {
        categoryRepository.createCategory(category);
        return category.getId();
    }

    @Override
    public void deleteCategory(Category category) {
        categoryRepository.deleteCategory(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.updateCategory(category);
    }

    @Override
    public void createProduct(Product product) {
        categoryRepository.createProduct(product);
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.getCategoryByName(name);
    }
}
