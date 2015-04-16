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
        return productRepository.getAllProduct();
    }

    @Override
    public List<Product> getAllProductByCategory(Long categoryId) {
        return productRepository.getAllProductByCategory(categoryId);
    }

    @Override
    public Long createProduct(Product product) {
        productRepository.createProduct(product);
        return product.getId();
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteProductById(id);
    }

    @Override
    public Product updateProduct(Product product) {
        productRepository.updateProduct(product);
        return  product;
    }

    @Override
    public Product getById(Long id, Class entityClass) {
        return productRepository.getById(id,Product.class);
    }

    @Override
    public Product create(Product object) {
        return productRepository.create(object);
    }

    @Override
    public Product update(Product object) {
        return productRepository.update(object);
    }

    @Override
    public boolean delete(Long id, Class entityClass) {
        return productRepository.delete(id,Product.class);
    }

    @Override
    public List<Product> getProductTenRow(Integer begin, Integer end) {
        return productRepository.getProductTenRow(begin, end);
    }
}
