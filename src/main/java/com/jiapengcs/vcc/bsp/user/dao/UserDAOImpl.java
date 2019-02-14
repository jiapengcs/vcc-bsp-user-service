package com.jiapengcs.vcc.bsp.user.dao;

import com.jiapengcs.vcc.bsp.user.bean.User;
import org.springframework.stereotype.Component;

/**
 * @author Jiapeng
 * @version V1.0
 * @date: 2019/2/14
 */
@Component
public class UserDAOImpl implements UserDAO {

    @Override
    public User queryById(Long id) {
        return new User(id, "Cincc");
    }
}
