package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("categoryRepository")
public class CategoryRepositoryImpl  implements CategoryRepository{

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public void createCategory(Category category) {
        getSession().save(category);
    }

    @Override
    public void deleteCategoryById(Long id) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void deleteProductById(Long id) {

    }
}
