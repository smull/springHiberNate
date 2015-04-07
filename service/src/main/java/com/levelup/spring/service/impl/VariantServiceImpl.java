package com.levelup.spring.service.impl;

import com.levelup.spring.dao.VariantRepository;
import com.levelup.spring.model.Variant;
import com.levelup.spring.service.VariantService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by java on 07.04.2015.
 */
public class VariantServiceImpl implements VariantService {

    @Autowired
    VariantRepository variantRepository;


    @Override
    public Variant getVariantById(Long id) {
        return variantRepository.getVariantById(id);
    }

    @Override
    public Variant getVariantByName(String name) {
        return variantRepository.getVariantByName(name);
    }

    @Override
    public Variant getVariantByPrice(Float price) {
        return null;
    }

    @Override
    public Variant getVariantByMaxPrice() {
        return null;
    }

    @Override
    public Variant getVariantByMinPrice() {
        return null;
    }

    @Override
    public Variant getVariantBySize(Variant variant, String size) {
        return null;
    }

    @Override
    public Variant getVariantByColor(Variant variant, String color) {
        return null;
    }
}
