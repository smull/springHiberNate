package com.levelup.spring.model;

import java.io.Serializable;

/**
 * Created by java on 07.04.2015.
 */
public class Variant implements Serializable {

    Long id;

    String color;

    String size;

    Float price;

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
}
