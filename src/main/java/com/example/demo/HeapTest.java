package com.example.demo;

import java.util.ArrayList;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2020/12/20 23:56
 */
public class HeapTest {

    byte[] b = new byte[1024 * 100]; //100kb

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Object> heapTests = new ArrayList<>();
        while (true) {
            heapTests.add(new HeapTest());
            Thread.sleep(20);
        }
    }
}
