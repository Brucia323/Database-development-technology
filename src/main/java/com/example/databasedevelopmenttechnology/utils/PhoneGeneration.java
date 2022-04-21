package com.example.databasedevelopmenttechnology.utils;

import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class PhoneGeneration {
    private static final String[] PHONE_NUMBER = {"130", "131", "132", "133",
            "134", "135", "136", "137", "138", "139", "145", "147", "150",
            "151", "152", "153", "154", "155", "156", "157", "158", "159",
            "180", "181", "182", "183", "185", "186", "187", "188", "189"};
    
    public static String getRandomPhone() {
        Random random = new Random();
        int index = random.nextInt(PHONE_NUMBER.length);
        String areaCode = String.valueOf((int) (Math.random() * 9000 + 1000));
        String userCode = String.valueOf((int) (Math.random() * 9000 + 1000));
        return PHONE_NUMBER[index] + areaCode + userCode;
    }
}
