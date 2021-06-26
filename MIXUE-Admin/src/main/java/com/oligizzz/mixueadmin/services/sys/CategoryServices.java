package com.oligizzz.mixueadmin.services.sys;

import com.oligizzz.mixueadmin.pojo.Category;

import java.util.List;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
public interface CategoryServices {

    /**
     * 获取所有书籍类别，并按照Id排序
     * @return
     */
    List<Category> getAllCategory();

    /**
     * 通过id查询指定书籍类别
     * @param id
     * @return
     */
    Category getCategoryById(Integer id);


}
