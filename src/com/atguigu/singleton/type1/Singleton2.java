package com.atguigu.singleton.type1;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/27 13:33
 *
 * 饿汉模式的第二种方法
 * 静态代码块创建
 */
public class Singleton2 {
    public static void main(String[] args) {
        Singletons2 singletons2 = Singletons2.getInstance();
    }
}

class Singletons2{

    private static Singletons2 instance;

    private Singletons2(){

    }

    static {
        instance = new Singletons2();
    }

    public static Singletons2 getInstance(){
        return instance;
    }
}
