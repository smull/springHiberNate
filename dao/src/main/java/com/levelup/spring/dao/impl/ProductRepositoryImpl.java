package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.ProductRepository;
import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;

import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public class ProductRepositoryImpl implements ProductRepository {

    List<Product> productList;
    CategoryRepositoryImpl categoryRepository;

    @Override
    public Product getProductById(Long id) {
        Product productB = new Product();
        for (Product product : productList) {
            if(product.getId().equals(id))
                productB = product;
        }
        return productB;
    }

    @Override
    public Product getProductByArticle(String article) {
        for (Product product : productList) {
            if(product.getArticle().equals(article))
                return product;
        }
        return null;
    }


    @Override
    public List<Product> getallProduct() {
        List<Category> categoryList = categoryRepository.categoryList;
        for (Category category : categoryList) {
            productList.addAll(category.getProductList());
        }
        return productList;
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
