package com.oligizzz.mixueadmin.services.sys;

import com.oligizzz.mixueadmin.pojo.Book;
import com.oligizzz.mixueadmin.pojo.Category;

import java.util.List;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
public interface SysBookServices {

    /**
     * 查询所有书籍，并按照Id排列
     * @return
     */
    List<Book> selectAllBook();

    /**
     * 根据Id查询所有书籍
     * @param id
     * @return
     */
    Book selectBookById(Integer id);

    /**
     *
     * @param id
     * @return
     */
    int deletedById(Integer id);

    /**
     * 添加书籍
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 根据总类查询书籍
     * @param category
     * @return
     */
    List<Book> selectByCategory(Category category);

    /**
     * 根据关键词查询所有书籍
     * @param keyWords
     * @return
     */
    List<Book> selectAllBookByKeyWords(String keyWords);

    int updateBook(Book book);
}
