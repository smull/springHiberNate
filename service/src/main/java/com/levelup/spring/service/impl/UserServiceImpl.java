package com.levelup.spring.service.impl;

import com.levelup.spring.dao.UserRepository;
import com.levelup.spring.model.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by SMULL on 23.04.2015.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User getById(Long id, Class entityClass) {
        return userRepository.getById(id,User.class);
    }

    @Override
    public User create(User object) {
        return userRepository.create(object);
    }

    @Override
    public User update(User object) {
        return userRepository.update(object);
    }

    @Override
    public boolean delete(Long id, Class entityClass) {
        return userRepository.delete(id,User.class);
    }
}
