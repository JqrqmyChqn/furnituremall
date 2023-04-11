/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.example.funituremall.service;

import com.example.funituremall.model.Furniture;
import com.example.funituremall.repository.FurnitureRepository;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FurnitureServiceImpl implements FurnitureService {
    private static final Set<String> administors = ImmutableSet.of("andi");

    @Autowired
    private FurnitureRepository funitureRepository;

    @Override
    public List<Furniture> queryAll() {
        return funitureRepository.queryAll();
    }

    @Override
    public Furniture queryById(String id, String userName) {
        Furniture furniture = funitureRepository.queryById(id);
        if (!administors.contains(userName)) {
            furniture.setVanessaId(null);
            furniture.setId(null);
        }
        return furniture;
    }

    @Override
    public List<Furniture> queryByName(String name) {
        return funitureRepository.queryByName(name);
    }

    @Override
    public Furniture insert(Furniture funiture) {
        return funitureRepository.insert(funiture);
    }
}