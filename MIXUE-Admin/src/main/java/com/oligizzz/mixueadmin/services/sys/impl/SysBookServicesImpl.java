package com.oligizzz.mixueadmin.services.sys.impl;

import com.oligizzz.mixueadmin.dao.sys.SysBookDao;
import com.oligizzz.mixueadmin.pojo.Book;
import com.oligizzz.mixueadmin.pojo.Category;
import com.oligizzz.mixueadmin.services.sys.SysBookServices;
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
public class SysBookServicesImpl implements SysBookServices {

    @Autowired
    SysBookDao bookDao;
    @Override
    public List<Book> selectAllBook() {
        return bookDao.selectAllBook();
    }

    @Override
    public Book selectBookById(Integer id) {
        return bookDao.selectBookById(id);
    }

    @Override
    public int deletedById(Integer id) {
        return bookDao.deletedBookById(id);
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public List<Book> selectByCategory(Category category) {
        return bookDao.selectBookByCategory(category);
    }

    @Override
    public List<Book> selectAllBookByKeyWords(String keyWords) {
        return bookDao.selectAllBookByKeyWords(keyWords);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }
}
