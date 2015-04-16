package com.levelup.spring.service.impl;

import com.levelup.spring.dao.VariantRepository;
import com.levelup.spring.model.Variant;
import com.levelup.spring.service.VariantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by java on 07.04.2015.
 */
@Service
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
        return variantRepository.getVariantByPrice(price);
    }

    @Override
    public Variant getVariantByMaxPrice() {
        return variantRepository.getVariantByMaxPrice();
    }

    @Override
    public Variant getVariantByMinPrice() {
        return variantRepository.getVariantByMinPrice();
    }

    @Override
    public Variant getVariantBySize(Variant variant, String size) {
        return null;
    }

    @Override
    public Variant getVariantByColor(Variant variant, String color) {
        return null;
    }

    @Override
    public Long createVariant(Variant variant) {
        variantRepository.createVariant(variant);
        return variant.getId();
    }

    @Override
    public Variant updateVariant(Variant variant) {
        variantRepository.updateVariant(variant);
        return variant;
    }

    @Override
    public void deleteVariantById(Long variantId) {
        variantRepository.deleteVariantById(variantId);
    }


    @Override
    public Variant getById(Long id, Class entityClass) {
        return variantRepository.getById(id,Variant.class);
    }

    @Override
    public Variant create(Variant object) {
        return variantRepository.create(object);
    }

    @Override
    public Variant update(Variant object) {
        return variantRepository.update(object);
    }

    @Override
    public boolean delete(Long id, Class entityClass) {
        return variantRepository.delete(id,Variant.class);
    }
}
