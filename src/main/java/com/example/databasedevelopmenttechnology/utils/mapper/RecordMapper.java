package com.example.databasedevelopmenttechnology.utils.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.databasedevelopmenttechnology.models.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface RecordMapper extends BaseMapper<Record> {
    void insertBatchSomeColumn(Collection<Record> entityList);
}
