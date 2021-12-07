package com.group12.bookstore;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.group12.bookstore.pojo.Book;
import com.group12.bookstore.pojo.User;
import com.group12.bookstore.service.admin.AdminBookService;
import com.group12.bookstore.service.admin.AdminService;
import com.group12.bookstore.service.user.UserService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@MapperScan("com.group12.bookstore.mapper.*")
@SpringBootTest
class BookStoreApplicationTests {

    @Autowired
    AdminService adminService;
    @Autowired
    UserService userService;
    @Autowired
    AdminBookService adminBookService;
    @Test
    void contextLoads() {
        QueryWrapper wrapper=new QueryWrapper();
        Map<String,Object> param=new HashMap<>();
        param.put("username","admin");
        param.put("password","admin945");
        wrapper.allEq(param);
        System.out.println(adminService.getOne(wrapper));
    }
    @Test
    void testUser(){
//        User user=new User();
//        user.setUsername("test");
//        user.setPassword("123456");
//        user.setEmail("zjhsuper@icloud.com");
//        user.setProfilePhotoName("name.jpg");
//        userService.save(user);
//        userService.removeById(1077268481);
//        user.setProfilePhotoName("a.jpg");
//        userService.updateById(user);
//        User user=userService.getById(2000003073);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("username",null);
        queryWrapper.or();
        queryWrapper.eq("email","zjhsuper@icloud.com");
        queryWrapper.eq("password","123456");
        User user = userService.getOne(queryWrapper);
//        Page<User> userPage=new Page<>(1,5);
//        List<User> userList=userService.page(userPage).getRecords();
        System.out.println(user);
    }
    @Test
    void testBook(){
//        Book book=new Book();
//        book.setId(1077252100);
//        book.setName("数据结构 考研版");
//        book.setPrice(new BigDecimal("39.99"));
//        book.setNum(1000);
//        book.setType("计算机");
//        book.setImageName("struct.jpg");
//        adminBookService.saveOrUpdate(book);
        List<Book> bookList=adminBookService.list();
        System.out.println(bookList);
    }
}
