/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.repository;

import com.example.funituremall.model.User;
import static com.google.common.collect.Iterables.getOnlyElement;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserReposityImpl implements UserRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public User insert(User user) {
        return mongoTemplate.insert(user);
    }

    public User queryByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));

        List<User> users = mongoTemplate.find(query, User.class);


        return users.isEmpty() ? null : getOnlyElement(users);
    }

    public List<User> queryAll(){

        return mongoTemplate.findAll(User.class);
    }
}