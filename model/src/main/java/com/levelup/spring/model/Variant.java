package com.levelup.spring.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by java on 07.04.2015.
 */
@Entity
@Table(name = "VARIANT")
public class Variant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String color;

    String size;

    Float price;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    Product product;

    public Variant() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
