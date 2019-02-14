package com.jiapengcs.vcc.bsp.user.controller;

import com.jiapengcs.vcc.bsp.user.dao.UserDAO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserDAO userDAO;

    @RequestMapping("/query")
    public Object getUserById(@RequestParam(name = "userId") Long userId) {
        System.out.println("query user...");
        return userDAO.queryById(userId);
    }
}
