package com.example.databasedevelopmenttechnology.utils.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.databasedevelopmenttechnology.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    void insertBatchSomeColumn(Collection<User> entityList);
}
