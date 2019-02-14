package com.jiapengcs.vcc.bsp.user.dao;

import com.jiapengcs.vcc.bsp.user.bean.User;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2018/11/25
 */
public interface UserDAO {

    User queryById(Long id);
}
