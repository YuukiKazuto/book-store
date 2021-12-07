package com.group12.bookstore.service.admin.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group12.bookstore.mapper.admin.AdminMapper;
import com.group12.bookstore.pojo.Admin;
import com.group12.bookstore.service.admin.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {
}
