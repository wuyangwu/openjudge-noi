package com.atguigu.singleton.type3;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 13:43
 *
 *
 * 线程安全的
 * 懒汉模式
 */
public class Singleton3 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

class Singleton{
    private static  Singleton instance;


    private Singleton(){

    }

    public  static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}