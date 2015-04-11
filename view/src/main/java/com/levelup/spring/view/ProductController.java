package com.levelup.spring.view;

import com.levelup.spring.model.Category;
import com.levelup.spring.model.Product;
import com.levelup.spring.service.CategoryService;
import com.levelup.spring.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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



    @RequestMapping(value = "/article", method = RequestMethod.GET)
    @ResponseBody
    public Product getProductByArticle(@RequestParam String article) {
        return  productService.getProductByArticle(article);
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getProductByCategory(@RequestParam Long id) {
        return  productService.getAllProductByCategory(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<String> createProduct(@RequestParam String article,
                                                @RequestParam String description,
                                                @RequestParam Float mainPrice,
                                                @RequestParam Long categoryId) {
        Product product = new Product();

        product.setArticle(article);
        product.setDescription(description);
        product.setMainPrice(mainPrice);
        product.setCategoryId(categoryId);

        Long id = productService.createProduct(product);
        return new ResponseEntity<String>(id.toString(), HttpStatus.OK);
    }

    @RequestMapping("/main")
    public String getCategoryView(Model model){
        return "category";
    }

    @RequestMapping(value = "/allCategory", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategory() {
        List<Category> categoryList = categoryService.getAllCategories();
        return  categoryList;
    }

}
