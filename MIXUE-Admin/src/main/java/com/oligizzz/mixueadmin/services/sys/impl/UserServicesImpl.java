package com.oligizzz.mixueadmin.services.sys.impl;

import com.oligizzz.mixueadmin.dao.sys.SysUserDao;
import com.oligizzz.mixueadmin.pojo.User;
import com.oligizzz.mixueadmin.services.sys.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    SysUserDao userDao;

    @Override
    public User login(String username, String password) {
        if (username == null || password == null) {
            return null;
        }
        return userDao.selectUserByCondition(new User(null, username, password));
    }
}
