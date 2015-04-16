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
import org.springframework.web.bind.annotation.*;


import javax.persistence.Entity;
import java.util.ArrayList;
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

    private Integer begin;
    private Integer end = 5;



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

//    @RequestMapping(value = "/create", method = RequestMethod.PUT)
//    @ResponseBody
//    public ResponseEntity<String> createProduct(@RequestParam String article,
//                                                @RequestParam String description,
//                                                @RequestParam Float mainPrice,
//                                                @RequestParam Long categoryId) {
//        Product product = new Product();
//
//        product.setArticle(article);
//        product.setDescription(description);
//        product.setMainPrice(mainPrice);
//        product.setCategoryId(categoryId);
//
//        Long id = productService.createProduct(product);
//        return new ResponseEntity<String>(id.toString(), HttpStatus.OK);
//    }

    @RequestMapping("/main")
    public String getCategoryView(Model model){
        List<Category> allCategories = categoryService.getAllCategories();
        model.addAttribute("allCategories",allCategories);
        return "category";
    }

    @RequestMapping("/deleteCategory")
    public void deleteCategory(@RequestParam String nameCategory){
        Category category = categoryService.getCategoryByName(nameCategory);
        categoryService.deleteCategory(category);
    }

    @RequestMapping(value = "/allCategory", method = RequestMethod.GET)
    @ResponseBody
    public List<Category> getAllCategory() {
        List<Category> categoryList = categoryService.getAllCategories();
        return  categoryList;
    }

    @RequestMapping(value = "allProducts", method = RequestMethod.POST)
    @ResponseBody
    public List<Product> getAllProduct() {
//        List<Product> productListAll = productService.getallProduct();
        List<Product> productListAll = productService.getProductTenRow(begin,end);
        begin = end;
        end += 5;

//        List<Product> productList = new ArrayList<>();
//        productList = productListAll.subList(begin,end);
//        begin = end;
//        if((end+5) < productListAll.size()) {
//            end += 5;
//        } else {
//            end = productListAll.size();
//        }
        return  productListAll;
    }

    @RequestMapping("/getCategory")
    public Category getCategoryByName(@RequestParam String nameCategory){
        Category category = categoryService.getCategoryByName(nameCategory);
        return  category;
    }

    @RequestMapping("/create")
    public String create(Model model){
        List<Product> products = productService.getallProduct();
        model.addAttribute("products",products);
        return  "create.page";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST,produces = "application/json")
    public @ResponseBody Product save(@RequestBody Product product){
//        Product product1 = new Product();
//        product1 = product;
        productService.create(product);
        return  product;
    }


}
