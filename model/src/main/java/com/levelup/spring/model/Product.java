package com.levelup.spring.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
public class Product implements Serializable {

    Long id;

    String article;

    String description;

    Float mainPrice;

    List<Variant> variantList;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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



    public List<Variant> getVariantList() {
        return variantList;
    }

    public void setVariantList(List<Variant> variantList) {
        this.variantList = variantList;
    }
}
