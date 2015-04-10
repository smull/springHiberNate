package com.levelup.spring.view;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.service.CategoryService;
import com.levelup.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by SMULL on 10.04.2015.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;





    @RequestMapping(value = "/article", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Product getProductByArticle() {
        String article = "dsdsds";
        return  productService.getProductByArticle(article);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Product> getProductByCategory() {
        String category = "clothes";
        return  productService.getAllProductByCategory(category);
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public void createProduct(String article, String description, Float mainPrice,Long categoryId) {
        article = "saaaaa";
        description = "dsdsdsd";
        mainPrice = 188.333F;
        categoryId = 2L;
        Category category = categoryService.getCategoryById(categoryId);
        productService.createProduct(article,description,mainPrice,category);
    }

}
