package com.example.demo;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2021/1/11 23:48
 */
public class HashMapDemo {

    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("zs", 1);


        ConcurrentHashMap<Object, Object> map = new ConcurrentHashMap<>();
        map.put("", "");
    }
}
