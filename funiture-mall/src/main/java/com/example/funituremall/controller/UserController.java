/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2022 All Rights Reserved.
 */
package com.example.funituremall.controller;

import com.example.funituremall.model.User;
import com.example.funituremall.service.UserService;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public User insert(@RequestBody User user) {
        user.setId(RandomUtils.nextLong());
        return userService.insert(user);
    }

    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    @ResponseBody
    public User queryByName(@RequestBody User user) {
        return userService.queryByName(user.getName());
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public boolean login(@RequestBody User user) {
        User userInDB = userService.queryByName(user.getName());
        if (userInDB == null) {
            return false;
        }
        return user.getPassword().equals(userInDB.getPassword());
    }
}