package com.example.databasedevelopmenttechnology.models;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("record_include_title")
@Data
public class RecordIncludeTitle {
    @TableId
    private String id;
    private String userId;
    private String title;
    private int result;
}
