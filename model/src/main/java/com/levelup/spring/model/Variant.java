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
    @Column(name="ID_VARIANT")
    Long id;

    String color;

    String size;

    Float price;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    public Variant() {
    }

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
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


    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
