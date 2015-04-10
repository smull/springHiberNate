package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.VariantRepository;
import com.levelup.spring.model.Variant;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("variantRepository")
@Transactional
public class VariantRepositoryImpl implements VariantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Variant getVariantById(Long id) {
        return null;
    }

    @Override
    public Variant getVariantByName(String name) {
        return null;
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
