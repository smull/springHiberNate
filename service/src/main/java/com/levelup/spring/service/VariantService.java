package com.levelup.spring.service;

import com.levelup.spring.model.Variant;

/**
 * Created by java on 07.04.2015.
 */
public interface VariantService {

    Variant getVariantById(Long id);

    Variant  getVariantByName(String name);

    Variant getVariantByPrice(Float price);

    Variant  getVariantByMaxPrice();

    Variant getVariantByMinPrice();

    Variant getVariantBySize(Variant variant, String  size);

    Variant getVariantByColor(Variant variant, String color);

    Long createVariant(Variant variant);

    Variant updateVariant(Variant variant);

    void deleteVariantById(Long variantId);



    public Variant getById(Long id, Class entityClass);

    public Variant create(Variant object);

    public Variant update(Variant object);

    public boolean delete(Long id, Class entityClass);
}
