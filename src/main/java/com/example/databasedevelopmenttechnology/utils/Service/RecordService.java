package com.example.databasedevelopmenttechnology.utils.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.databasedevelopmenttechnology.models.Record;
import com.example.databasedevelopmenttechnology.utils.mapper.RecordMapper;
import org.springframework.stereotype.Service;

@Service
public class RecordService extends ServiceImpl<RecordMapper, Record> {
}
