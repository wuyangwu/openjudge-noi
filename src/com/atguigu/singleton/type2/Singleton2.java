package com.atguigu.singleton.type2;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 13:37
 *
 *    饱汉模式 线程不安全方式
 */
public class Singleton2 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            return new Singleton();
        }
        return  instance;
    }
}