/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.service;

import com.example.funituremall.model.User;
import com.example.funituremall.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;

    public User insert(User user) {
        return userRepository.insert(user);
    }

    public User queryByName(String name) {
        return userRepository.queryByName(name);
    }
}