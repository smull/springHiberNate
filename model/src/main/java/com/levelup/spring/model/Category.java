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
    @Column(name="ID_CATEGORY")
    private Long id;

    private String nameCategory;


    @OneToMany(targetEntity = Product.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="CATEGORY_ID", referencedColumnName = "ID_CATEGORY")
    List<Product> productList;

    public Category() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
