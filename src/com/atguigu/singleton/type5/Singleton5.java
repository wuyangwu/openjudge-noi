package com.atguigu.singleton.type5;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 15:08
 */
public class Singleton5 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
    }
}

enum Singleton{
    INSTANCE; // 属性
    public void sayOk(){
        System.out.println("ok~");
    }
}