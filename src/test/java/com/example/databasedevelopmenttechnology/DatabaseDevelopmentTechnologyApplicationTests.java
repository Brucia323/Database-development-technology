package com.example.databasedevelopmenttechnology;

import com.example.databasedevelopmenttechnology.models.Record;
import com.example.databasedevelopmenttechnology.models.TK;
import com.example.databasedevelopmenttechnology.models.User;
import com.example.databasedevelopmenttechnology.utils.GenderGeneration;
import com.example.databasedevelopmenttechnology.utils.NameGeneration;
import com.example.databasedevelopmenttechnology.utils.PhoneGeneration;
import com.example.databasedevelopmenttechnology.utils.TopicGeneration;
import com.example.databasedevelopmenttechnology.utils.mapper.RecordIncludeTitleMapper;
import com.example.databasedevelopmenttechnology.utils.mapper.RecordMapper;
import com.example.databasedevelopmenttechnology.utils.mapper.TKMapper;
import com.example.databasedevelopmenttechnology.utils.mapper.UserMapper;
import com.google.gson.Gson;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@SpringBootTest
class DatabaseDevelopmentTechnologyApplicationTests {
    @Resource
    UserMapper userMapper;
    @Resource
    TKMapper tkMapper;
    @Resource
    RecordMapper recordMapper;
    @Resource
    RecordIncludeTitleMapper recordIncludeTitleMapper;
    
    @Test
    void contextLoads() {
        Long start = System.currentTimeMillis();
        generateUser();
        generateTK();
        generateRecord();
        getAllRecordIncludeTitle();
        Long end = System.currentTimeMillis();
        System.out.println("运行耗时：" + (end - start) + "ms");
    }
    
    private void getAllRecordIncludeTitle() {
        Gson gson = new Gson();
        System.out.println(gson.toJson(recordIncludeTitleMapper.selectList(null)));
    }
    
    private void generateRecord() {
        List<User> users = userMapper.selectList(null);
        int usersSize = users.size();
        List<TK> tks = tkMapper.selectList(null);
        int tksSize = tks.size();
        List<Record> records = new CopyOnWriteArrayList<>();
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 10000; i++) {
                Record record = new Record();
                int index = (int) (Math.random() * (usersSize));
                record.setUserId(users.get(index).getId());
                index = (int) (Math.random() * (tksSize));
                record.setTkId(tks.get(index).getId());
                record.setResult((int) (Math.random() * 2));
                records.add(record);
            }
            recordMapper.insertBatchSomeColumn(records);
            records.clear();
        }
        recordMapper.insertBatchSomeColumn(records);
    }
    
    private void generateTK() {
        Document document = TopicGeneration.load("src/main/resources/static" +
                "/fps-loj-small-pics.xml");
        List<TK> tks = new ArrayList<>();
        Element root = document.getRootElement();
        List<Element> items = root.elements("item");
        for (Element o : items) {
            TK tk = new TK();
            Element element1 = o.element("title");
            String text = element1.getText();
            tk.setTitle(text.replace("&nbsp;", " "));
            tks.add(tk);
        }
        document = TopicGeneration.load("src/main/resources/static/fps-www" +
                ".educg.net-codeforce-1-2833.xml");
        root = document.getRootElement();
        items = root.elements("item");
        for (Element item : items) {
            TK tk = new TK();
            Element element1 = item.element("title");
            String text = element1.getText();
            tk.setTitle(text.replace("&nbsp;", " "));
            tks.add(tk);
        }
        tkMapper.insertBatchSomeColumn(tks);
    }
    
    private void generateUser() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            User user = new User();
            user.setName(NameGeneration.getRandomName());
            user.setGender(GenderGeneration.getRandomGender());
            user.setPhone(PhoneGeneration.getRandomPhone());
            users.add(user);
        }
        userMapper.insertBatchSomeColumn(users);
    }
    
}
