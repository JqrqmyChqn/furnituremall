/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.service;

import com.example.funituremall.model.User;

public interface UserService {

    public User insert(User user);

    public User queryByName(String name);
}