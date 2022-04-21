package com.example.databasedevelopmenttechnology.utils;

import org.springframework.context.annotation.Configuration;

@Configuration
public class GenderGeneration {
    private static final int[] GENDER = {0, 1};
    
    public static int getRandomGender() {
        int index = (int) (Math.random() * 2);
        return GENDER[index];
    }
}
