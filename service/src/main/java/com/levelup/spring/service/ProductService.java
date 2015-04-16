package com.levelup.spring.service;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.model.Variant;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public interface ProductService {

    Product getProductById(Long id);

    Product getProductByArticle(String article);


    List<Product> getallProduct();

    List<Product> getAllProductByCategory(Long categoryId);

    Long createProduct(Product product);

    void deleteProductById(Long id);

    Product updateProduct(Product product);

    List<Product> getProductTenRow(Integer begin, Integer end);

    public Product getById(Long id, Class entityClass);

    public Product create(Product object);

    public Product update(Product object);

    public boolean delete(Long id, Class entityClass);
}
