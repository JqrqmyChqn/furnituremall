/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.example.funituremall.repository;

import com.example.funituremall.model.Furniture;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class FurnitureRepositoryImpl implements FurnitureRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Furniture> queryAll() {
        return mongoTemplate.findAll(Furniture.class);
    }

    @Override
    public Furniture queryById(String id) {
        return mongoTemplate.findById(id, Furniture.class);
    }

    @Override
    public List<Furniture> queryByName(String name) {
        String searchWord = name + ".*";
        Query query = new Query(Criteria.where("name").regex(searchWord));
        return mongoTemplate.find(query, Furniture.class);
    }

    @Override
    public Furniture insert(Furniture furniture) {
        return mongoTemplate.insert(furniture);
    }

    @Override
    public Furniture update(String name, byte[] pictureBytes) {
        Query query = Query.query(Criteria.where("name").is(name));
        Furniture existingFurniture = mongoTemplate.findOne(query, Furniture.class);

        existingFurniture.setPictureBytes(pictureBytes);

        mongoTemplate.save(existingFurniture);
        return existingFurniture;
    }

}