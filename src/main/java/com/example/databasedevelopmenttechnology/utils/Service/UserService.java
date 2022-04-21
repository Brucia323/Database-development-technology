package com.example.databasedevelopmenttechnology.utils.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.databasedevelopmenttechnology.models.User;
import com.example.databasedevelopmenttechnology.utils.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
