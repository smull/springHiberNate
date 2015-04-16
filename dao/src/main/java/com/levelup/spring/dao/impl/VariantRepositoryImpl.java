package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.AbstractRepository;
import com.levelup.spring.dao.VariantRepository;
import com.levelup.spring.model.Variant;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by java on 07.04.2015.
 */
@Repository("variantRepository")
public class VariantRepositoryImpl extends AbstractRepository<Variant> implements VariantRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Variant getVariantById(Long id) {
        Variant variant = entityManager.find(Variant.class, id);
        return variant;
    }

    @Override
    public Variant getVariantByName(String name) {
        Query query1 = entityManager.createQuery("SELECT v FROM Variant v WHERE v.name = :name");
        query1.setParameter("name", name);
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return null;
    }

    @Override
    public Variant getVariantByPrice(Float price) {
        Query query1 = entityManager.createQuery("SELECT v FROM Variant v WHERE v.price = :price");
        query1.setParameter("price", price);
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return variant;
    }

    @Override
    public Variant getVariantByMaxPrice() {
        Query query1 = entityManager.createQuery("SELECT MIN(price) AS SmallestOrderPrice FROM Variant");
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return variant;
    }

    @Override
    public Variant getVariantByMinPrice() {
        Query query1 = entityManager.createQuery("SELECT MAX(price) AS BiggestOrderPrice FROM Variant");
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return variant;
    }

    @Override
    public Variant getVariantBySize(String size) {
        Query query1 = entityManager.createQuery("SELECT v FROM Variant v WHERE v.size = :size");
        query1.setParameter("size", size);
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return variant;
    }

    @Override
    public Variant getVariantByColor( String color) {
        Query query1 = entityManager.createQuery("SELECT v FROM Variant v WHERE v.color = :color");
        query1.setParameter("color", color);
        Variant variant = (Variant) query1.getSingleResult();
        if(variant==null)return null;
        return variant;
    }

    @Override
    public Long createVariant(Variant variant) {
        entityManager.persist(variant);
        return variant.getId();
    }

    @Override
    public Variant updateVariant(Variant variant) {
        entityManager.merge(variant);
        return variant;
    }

    @Override
    public void deleteVariantById(Long variantId) {
        Variant variant = getVariantById(variantId);
        if(variant != null) {
            entityManager.remove(variant);
        }
    }
}
