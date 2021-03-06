package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.AbstractRepository;
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
public class ProductRepositoryImpl extends AbstractRepository<Product> implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product getProductById(Long id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public Product getProductByArticle(String article) {
        Query query1 = entityManager.createQuery("SELECT p FROM Product p WHERE p.article = :article");
        query1.setParameter("article", article);
        Product product = (Product) query1.getSingleResult();
        if (product == null) return null;
        return product;
    }

    @Override
    public List<Product> getAllProduct() {
        Query query = entityManager.createNativeQuery("SELECT * FROM Product", Product.class);
        List<Product> productList = query.getResultList();
        return productList;
    }

    @Override
    public List<Product> getAllProductByCategory(Long categoryId) {
        Query query = entityManager.createQuery("SELECT p FROM Product p WHERE p.categoryId = :categoryId");
        query.setParameter("categoryId", categoryId);
        List<Product> products = query.getResultList();
        return products;
    }

    @Override
    public Long createProduct(Product product) {
        entityManager.persist(product);
        return product.getId();
    }

    @Override
    public void deleteProductById(Long id) {
        Product product = getProductById(id);
        if (product != null) {
            entityManager.remove(product);
        }
    }


    @Override
    public Product updateProduct(Product product) {
        entityManager.merge(product);
        return product;
    }

    @Override
    public List<Product> getProductTenRow(Integer begin, Integer end) {
        Query query;
        if (end != null && end != 0) {
            query = entityManager.createQuery("SELECT * FROM table limit " + begin.toString());
        }
        query = entityManager.createQuery("SELECT * FROM table limit " + begin.toString() + ", " + end.toString());
        List<Product> productList = query.getResultList();
        if (!productList.isEmpty()) {
            return productList;

        }
        return null;
    }
}
