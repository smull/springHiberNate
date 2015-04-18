package com.levelup.spring.service.impl;

import com.levelup.spring.dao.AccountRepository;
import com.levelup.spring.model.Account;
import com.levelup.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by java on 18.04.2015.
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;


    @Override
    public Account getById(Long id, Class entityClass) {
        return accountRepository.getById(id,Account.class);
    }

    @Override
    public Account create(Account object) {
        return accountRepository.create(object);
    }

    @Override
    public Account update(Account object) {
        return accountRepository.update(object);
    }

    @Override
    public boolean delete(Long id, Class entityClass) {
        return accountRepository.delete(id,Account.class);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.getAllAccounts();
    }
}
