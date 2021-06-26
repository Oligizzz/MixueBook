package com.oligizzz.mixueadmin.services.sys;

import com.oligizzz.mixueadmin.pojo.User;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
public interface UserServices {

    /**
     * 用户登陆
     * @param username 用户名
     * @param password 用户密码
     * @return
     */
    User login(String username, String password);
}
