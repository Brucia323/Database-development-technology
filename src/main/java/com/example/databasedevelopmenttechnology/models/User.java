package com.example.databasedevelopmenttechnology.models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;
    private String name;
    private int gender;
    private String phone;
}
