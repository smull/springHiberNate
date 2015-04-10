package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.ProductRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("productRepository")
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product getProductById(Long id) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.id = :productId");
        query.setParameter("productId", id);

        Product product = (Product) query.getSingleResult();
        return product;
    }

    @Override
    public Product getProductByArticle(String article) {
        Query query1 = entityManager.createQuery("SELECT p FROM Product p WHERE p.article = :article");
        query1.setParameter("article", article);
        Product product = (Product) query1.getSingleResult();
        if(product==null)return null;
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        Query query = entityManager.createNativeQuery("SELECT * FROM Product",Product.class);
        List<Product> productList = query.getResultList();
        return productList;
    }

    @Override
    public List<Product> getAllProductByCategory(String category) {
        Query query1 = entityManager.createQuery("SELECT p FROM Product p WHERE p.category.name = :category");
        query1.setParameter("category",category);
        List<Product> products = query1.getResultList();
        return products;
    }

    @Override
    public void createProduct(String article, String description, Float mainPrice, Category category) {
        Product product = new Product();
        product.setArticle(article);
        product.setDescription(description);
        product.setMainPrice(mainPrice);
        product.setCategory(category);
        entityManager.persist(product);
    }

    @Override
    public void deleteProductById(Long id) {
        Product product = getProductById(id);
        if(product != null) {
            entityManager.remove(product);
        }
    }

//    private Product findProduct(Long id){
//        return entityManager.find(Product.class, id);
//    }

    @Override
    public void updateProduct(Product product) {

    }
}
