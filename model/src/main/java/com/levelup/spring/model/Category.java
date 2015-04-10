package com.levelup.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Entity
@Table(name = "CATEGORY")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    @OneToMany(targetEntity = Product.class, mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Product> productList;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
