package com.group12.bookstore.service.user.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.group12.bookstore.mapper.user.UserMapper;
import com.group12.bookstore.pojo.User;
import com.group12.bookstore.service.user.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
