package com.example.databasedevelopmenttechnology.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tk")
public class TK {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String title;
}
