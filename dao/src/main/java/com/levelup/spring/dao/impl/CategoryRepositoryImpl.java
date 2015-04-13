package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.CategoryRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.ResultSet;
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
        Category category = entityManager.find(Category.class, id);
        return category;
    }

    @Override
    public Long createCategory(Category category) {
        entityManager.persist(category);
        return category.getId();
    }

    @Override
    public void deleteCategory(Category category) {
        if(category != null) {
            entityManager.remove(category);
        }
    }

    @Override
    public Category updateCategory(Category category) {
        entityManager.merge(category);
        return category;
    }

    private void init() {
        Category category = new Category();
        category.setNameCategory("Computer");
        entityManager.persist(category);

        category = new Category();
        category.setNameCategory("Clothes");
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
        Query query = entityManager.createQuery("FROM Category");
        List<Category> categoryList = query.getResultList();
        return categoryList;
    }


    @Override
    public Long createProduct(Product product) {
        return  null;
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public Category getCategoryByName(String nameCategory) {
        Query query = entityManager.createQuery("FROM Category c WHERE c.nameCategory = :nameCategory");
        query.setParameter("nameCategory", nameCategory);
        List<Category> categories = query.getResultList();
        Category category = null;
        if(!categories.isEmpty())
            category = categories.get(0);
//        Category category = (Category) query.getSingleResult();
        return category;
    }
}
