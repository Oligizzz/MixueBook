package com.oligizzz.mixueadmin.dao.sys;

import com.oligizzz.mixueadmin.pojo.Book;
import com.oligizzz.mixueadmin.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: GNMD
 * @Description: 书籍持久层
 * @Date: 2021/6/26
 * @Modify By:
 */
@Mapper
public interface SysBookDao {

    /**
     * 查询所有书籍并按照id升序排列
     * @return
     */
    List<Book> selectAllBook();

    /**
     * 根据Id查询书籍
     * @param id
     * @return
     */
    Book selectBookById(Integer id);

    /**
     * 根据种类查询书籍
     * @param category
     * @return
     */
    List<Book> selectBookByCategory(@Param("category") Category category);

    /**
     * 更具关键字查询相关书籍
     * @param keyWords
     * @return
     */
    List<Book> selectAllBookByKeyWords(String keyWords);
    /**
     * 添加书籍
     * @param book
     * @return
     */
    int addBook(Book book);

    /**
     * 通过Id删除书籍
     * @param id
     * @return
     */
    int deletedBookById(Integer id);


    /**
     * 更新书籍
     * @param book
     * @return
     */
    int updateBook(Book book);


}
