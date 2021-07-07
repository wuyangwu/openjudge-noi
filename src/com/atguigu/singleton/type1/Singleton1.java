package com.atguigu.singleton.type1;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/5/23 18:41
 *
 * 饿汉 单列模式
 */
public class Singleton1 {
    public static void main(String[] args) {
        //拿到实例
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 =Singleton.getInstance();
        System.out.println(singleton == singleton1);
        System.out.println("singleton 的hashcode"+singleton.hashCode());
        System.out.println("singleton1 的hashcode"+singleton1.hashCode());

    }
}
// 饿汉式
class Singleton{
    //1.构造函数私有化，外部不能new
    private Singleton(){

    }
    // 2.本类内部创建对象实例
    private  final static  Singleton instance = new Singleton();

    // 3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}