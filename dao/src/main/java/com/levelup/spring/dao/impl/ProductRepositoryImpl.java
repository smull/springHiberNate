package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.ProductRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("productRepository")
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product getProductByArticle(String article) {
        return null;
    }

    @Override
    public List<Product> getallProduct() {
        return null;
    }

    @Override
    public List<Product> getAllProductByCategory(Category category) {
        return null;
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Product product) {

    }
}
