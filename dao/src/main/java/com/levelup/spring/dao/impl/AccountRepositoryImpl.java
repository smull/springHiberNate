package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.AbstractRepository;
import com.levelup.spring.dao.AccountRepository;
import com.levelup.spring.model.Account;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by java on 18.04.2015.
 */
@Repository("accountRepository")
public class AccountRepositoryImpl extends AbstractRepository<Account> implements AccountRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Account> getAllAccounts() {
        Query query = entityManager.createQuery("FROM ACCOUNT");
        List<Account> accounts = query.getResultList();
        return accounts;
    }


    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
