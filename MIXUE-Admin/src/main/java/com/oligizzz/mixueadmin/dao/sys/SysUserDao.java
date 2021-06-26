package com.oligizzz.mixueadmin.dao.sys;

import com.oligizzz.mixueadmin.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */

@Mapper
public interface SysUserDao {

    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    User selectUserById(Integer id);

    /**
     * 根据相关条件查询用户
     * @param user 条件
     * @return
     */
    User selectUserByCondition(User user);
}
