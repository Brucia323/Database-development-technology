package com.example.databasedevelopmenttechnology.utils.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.databasedevelopmenttechnology.models.TK;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface TKMapper extends BaseMapper<TK> {
    void insertBatchSomeColumn(Collection<TK> entityList);
}
