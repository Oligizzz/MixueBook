package com.oligizzz.mixueadmin.dao.sys;

import com.oligizzz.mixueadmin.pojo.Book;
import com.oligizzz.mixueadmin.pojo.Category;
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
class SysBookDaoTest {

    @Autowired
    SysBookDao bookDao;
    @Test
    void selectBookById() {
        System.out.println(bookDao.selectBookById(1));
    }

    @Test
    void addBook() {
        Book book = new Book();
        book.setCover("https://i.loli.net/2019/04/10/5cada9c852298.jpg");
        book.setTitle("613");
        book.setAuthor("kongxiao");
        book.setDate("2021年6月26日");
        book.setPress("CCUT出版社");
        book.setCid(2);
        System.out.println(bookDao.addBook(book));
    }

    @Test
    void selectBookByCategory() {
        Category c = new Category();
        c.setName("文学");
        System.out.println(bookDao.selectBookByCategory(c));
    }
}
