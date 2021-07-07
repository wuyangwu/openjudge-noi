package com.atguigu.singleton.type4;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 13:45
 *
 * 线程安全的
 * 懒汉模式
 */
public class Singleton4 {
    public static void main(String[] args) {
        
    }
}

class Singleton{

    private static volatile Singleton instance;

    private Singleton(){

    }

    // 写一个静态内部类，该类中有一个静态属性Singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}