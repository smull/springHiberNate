package com.levelup.spring.dao;


import com.levelup.spring.model.User;

/**
 * Created by SMULL on 23.04.2015.
 */
public interface UserRepository  {

    public User getById(Long id, Class entityClass);

    public User create(User object);

    public User update(User object);

    public boolean delete(Long id, Class entityClass);
}
