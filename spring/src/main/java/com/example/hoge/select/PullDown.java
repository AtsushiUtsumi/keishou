package com.example.hoge.select;

import java.util.TreeMap;
import org.springframework.stereotype.Component;

@Component
public class PullDown {
    public TreeMap<String, String> createMap() {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("hoge1", "hogehoge1");
        map.put("hoge2", "hogehoge2");
        map.put("hoge3", "hogehoge3");
        return map;
    }
}