/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.repository;

import com.example.funituremall.model.User;
import java.util.List;

public interface UserRepository {

    public User insert(User user);

    public User queryByName(String name);

    public List<User> queryAll();
}