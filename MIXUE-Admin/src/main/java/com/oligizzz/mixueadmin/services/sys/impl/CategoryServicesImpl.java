package com.oligizzz.mixueadmin.services.sys.impl;

import com.oligizzz.mixueadmin.dao.sys.SysCategoryDao;
import com.oligizzz.mixueadmin.pojo.Category;
import com.oligizzz.mixueadmin.services.sys.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
@Service
public class CategoryServicesImpl implements CategoryServices {
    @Autowired
    SysCategoryDao categoryDao;

    @Override
    public List<Category> getAllCategory() {
        return categoryDao.selectAll();
    }

    @Override
    public Category getCategoryById(Integer id) {
        return categoryDao.selectCategoryById(id);
    }
}
