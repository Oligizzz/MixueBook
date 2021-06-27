package com.oligizzz.mixueadmin.web.controller;

import com.oligizzz.mixueadmin.dao.sys.SysCategoryDao;
import com.oligizzz.mixueadmin.pojo.Book;
import com.oligizzz.mixueadmin.pojo.Category;
import com.oligizzz.mixueadmin.services.sys.SysBookServices;
import com.oligizzz.mixueadmin.services.sys.impl.SysBookServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: GNMD
 * @Description:
 * @Date: 2021/6/26
 * @Modify By:
 */
@Controller
public class LibraryController {

    @Autowired
    SysBookServicesImpl bookServices;
    @Autowired
    SysCategoryDao categoryDao;

    @CrossOrigin
    @GetMapping("/api/books")
    @ResponseBody
    public List<Book> getBookList(){
        return bookServices.selectAllBook();
    }

    @CrossOrigin
    @PostMapping("/api/books")
    @ResponseBody
    public Book addBook(@RequestBody Book book){
        int count = bookServices.addBook(book);
        if(count>0){
            return book;
        }else {
            return null;
        }
    }

    @CrossOrigin
    @PostMapping("/api/deleted")
    public void deletedBook(Book book){
        int count = bookServices.deletedById(book.getId());
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/books")
    @ResponseBody
    public List<Book> getAllBookByCategory(@PathVariable("cid") int cid){
        // 如果CID为0 ，请求全部书籍
        if(cid == 0){
            return bookServices.selectAllBook();
        }
        //否则分类查询
        Category category = categoryDao.selectCategoryById(cid);
        if(category==null){
            return new ArrayList<>();
        }else{
            return bookServices.selectByCategory(category);
        }
    }

    @CrossOrigin
    @GetMapping("/api/search")
    @ResponseBody
    public List<Book> getAllBookByKeyWords(@RequestParam("keywords") String keywords){
        if("".equals(keywords)){
            return bookServices.selectAllBook();
        }
        System.out.println(keywords);
        return bookServices.selectAllBookByKeyWords(keywords);
    }


}
