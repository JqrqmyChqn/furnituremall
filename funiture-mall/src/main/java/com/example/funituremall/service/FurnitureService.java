/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.example.funituremall.service;

import com.example.funituremall.model.Furniture;
import java.util.List;

public interface FurnitureService {

    List<Furniture> queryAll();

    Furniture queryById(String id, String username);

    List<Furniture> queryByName(String name);

    Furniture insert(Furniture funiture);
}