package com.levelup.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID_PRODUCT")
    Long id;

    String article;

    String description;

    Float mainPrice;

    @Column(name = "CATEGORY_ID")
    private Long categoryId;


    @OneToMany(targetEntity = Variant.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="PRODUCT_ID", referencedColumnName = "ID_PRODUCT")
    List<Variant> variantList;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getMainPrice() {
        return mainPrice;
    }

    public void setMainPrice(Float mainPrice) {
        this.mainPrice = mainPrice;
    }


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public List<Variant> getVariantList() {
        return variantList;
    }

    public void setVariantList(List<Variant> variantList) {
        this.variantList = variantList;
    }
}
