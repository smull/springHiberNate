package com.levelup.spring.dao.impl;

import com.levelup.spring.dao.AbstractRepository;
import com.levelup.spring.dao.UserRepository;
import com.levelup.spring.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by SMULL on 23.04.2015.
 */
@Repository("userRepository")
public class UserRepositoryImpl extends AbstractRepository<User> implements UserRepository {
}
