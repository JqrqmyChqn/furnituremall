/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.repository;

import com.example.funituremall.model.Furniture;
import java.util.List;

public interface FurnitureRepository {

    /**
     * 查询所有家具
     * @return
     */
    public List<Furniture> queryAll();

    /**
     * 用ID查询某个家具
     *
     * @param id
     * @return
     */
    public Furniture queryById(String id);

    /**
     * 用名字查询某个家具
     */
    public List<Furniture> queryByName(String name);

    /**
     * 插入家具
     *
     * @param funiture
     * @return
     */
    public Furniture insert(Furniture funiture);

    /**
     * 更新家具
     *
     * @param
     * @return
     */
    public Furniture update(String name, byte[] pictureBytes);
}