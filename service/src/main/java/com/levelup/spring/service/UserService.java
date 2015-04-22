package com.levelup.spring.service;

import com.levelup.spring.model.User;

/**
 * Created by SMULL on 23.04.2015.
 */
public interface UserService {

    public User getById(Long id, Class entityClass);

    public User create(User object);

    public User update(User object);

    public boolean delete(Long id, Class entityClass);
}
