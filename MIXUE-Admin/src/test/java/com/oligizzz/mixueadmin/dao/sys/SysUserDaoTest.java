package com.oligizzz.mixueadmin.dao.sys;

import com.oligizzz.mixueadmin.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class SysUserDaoTest {

    @Autowired
    SysUserDao userDao;

    @Test
    void selectUserById() {
        System.out.println(userDao.selectUserById(1));
    }

    @Test
    void selectUserByCondition() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        System.out.println(userDao.selectUserByCondition(user));
    }
}
