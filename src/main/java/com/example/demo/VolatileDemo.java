package com.example.demo;

/**
 * @Description: java类作用描述
 * @Author: huangtf
 * @CreateDate: 2020/12/20 22:59
 */
public class VolatileDemo {

    //volatile 使多个线程都能感知到这个变量，不加时，即使是全局变量，在一个线程中进行了修改，其他线程也感知不到
    private static volatile Boolean flag = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("wainting data ...");
                while (!flag) {
                }
                System.out.println("==========");
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                preparData();
            }
        }).start();
    }

    public static void preparData() {
        System.out.println("preparData ...");
        flag = true;
        System.out.println("preparData end ...");
    }
}
