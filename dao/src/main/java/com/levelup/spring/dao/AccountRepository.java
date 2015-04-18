package com.levelup.spring.dao;

import com.levelup.spring.model.Account;

import java.util.List;

/**
 * Created by java on 18.04.2015.
 */
public interface AccountRepository {


    public Account getById(Long id, Class entityClass);

    public Account create(Account object);

    public Account update(Account object);

    public boolean delete(Long id, Class entityClass);



    public List<Account> getAllAccounts();

}
