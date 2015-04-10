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
    Long id;

    String article;

    String description;

    Float mainPrice;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    Category category;

    @OneToMany(targetEntity = Variant.class, mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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


    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Variant> getVariantList() {
        return variantList;
    }

    public void setVariantList(List<Variant> variantList) {
        this.variantList = variantList;
    }
}
