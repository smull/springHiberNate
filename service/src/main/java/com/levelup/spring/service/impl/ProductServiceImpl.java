package com.levelup.spring.service.impl;

import com.levelup.spring.dao.ProductRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.model.Variant;
import com.levelup.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    ProductRepository productRepository;




    @Override
    public Product getProductById(Long id) {
        return productRepository.getProductById(id);
    }

    @Override
    public Product getProductByArticle(String article) {
        return productRepository.getProductByArticle(article);
    }

    @Override
    public List<Product> getallProduct() {
        return null;
    }

    @Override
    public List<Product> getAllProductByCategory(String category) {
        return productRepository.getAllProductByCategory(category);
    }

    @Override
    public void createProduct(String article, String description, Float mainPrice,Category category) {
        productRepository.createProduct(article, description, mainPrice, category);
    }

    @Override
    public void deleteProductById(Long id) {

    }

    @Override
    public void updateProduct(Product product) {

    }
}
