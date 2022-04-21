package com.example.databasedevelopmenttechnology.utils;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class TopicGeneration {
    public static Document load(String filename) {
        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filename));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return document;
    }
}
