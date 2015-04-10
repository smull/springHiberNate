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

    List<Product> getAllProductByCategory(String category);

    void createProduct(String article, String description, Float mainPrice, Category category);

    void deleteProductById(Long id);

    void updateProduct(Product product);
}
