package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("categoryRepository")
@Transactional
public class CategoryRepositoryImpl  implements CategoryRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Category getCategoryById(Long id) {
        Query query = entityManager.createQuery("SELECT c FROM Category c WHERE c.id = :categoryId");
        query.setParameter("categoryId",id);

        Category category = (Category) query.getSingleResult();
        return category;
    }

    @Override
    public Category createCategory(String name) {
        Category category = new Category();
        category.setName(name);
        entityManager.persist(category);
        return category;
    }

    @Override
    public void deleteCategoryById(Long id) {
        Category category = getCategoryById(id);
        if(category != null) {
            entityManager.remove(category);
        }
    }

    @Override
    public Category updateCategory(String name) {
        Category category = new Category();
        category.setName(name);
        entityManager.persist(category);
        return category;
    }

    private void init() {
        Category category = new Category();
        category.setName("Computer");
        entityManager.persist(category);

        category = new Category();
        category.setName("Clothes");
        entityManager.persist(category);

        Product product = new Product();
        product.setArticle("dsdsds");
        product.setDescription("wqwqwq");
        product.setMainPrice(122.33F);
        List<Product> products = new ArrayList<>();
        products.add(product);

        category.setProductList(products);
        entityManager.merge(category);

    }

    @Override
    public List<Category> getAllCategories() {
        init();
        Query query = entityManager.createNativeQuery("SELECT * FROM Category",Category.class);
        List<Category> categoryList = query.getResultList();
        return categoryList;
    }


    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void deleteProductById(Long id) {

    }



}
