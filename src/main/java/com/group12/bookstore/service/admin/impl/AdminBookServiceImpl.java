package com.group12.bookstore.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group12.bookstore.mapper.admin.AdminBookMapper;
import com.group12.bookstore.pojo.Book;
import com.group12.bookstore.service.admin.AdminBookService;
import org.springframework.stereotype.Service;

@Service
public class AdminBookServiceImpl extends ServiceImpl<AdminBookMapper,Book> implements AdminBookService {
}
