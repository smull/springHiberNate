package com.levelup.spring.dao;

import com.levelup.spring.model.Product;
import com.levelup.spring.model.Variant;

/**
 * Created by java on 07.04.2015.
 */
public interface VariantRepository {

    Variant getVariantById(Long id);

    Variant  getVariantByName(String name);

    Variant getVariantByPrice(Float price);

    Variant  getVariantByMaxPrice();

    Variant getVariantByMinPrice();

    Variant getVariantBySize(String  size);

    Variant getVariantByColor(String color);

    Long createVariant(Variant variant);

    Variant updateVariant(Variant variant);

    void deleteVariantById(Long variantId);


}
