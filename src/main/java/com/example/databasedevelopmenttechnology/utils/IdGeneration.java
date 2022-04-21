package com.example.databasedevelopmenttechnology.utils;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

@Component
public class IdGeneration implements IdentifierGenerator {
    
    private final AtomicLong al = new AtomicLong(1);
    
    @Override
    public Long nextId(Object entity) {
        return al.getAndAdd(1);
    }
}
