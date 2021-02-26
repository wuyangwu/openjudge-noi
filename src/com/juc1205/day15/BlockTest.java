package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 15:50
 * 静态随着类的加载而加载
 *
 * 类的成员之四：代码块（初始化块）
 *  1. 作用：用来初始化类或对象的信息
 *  2. 代码块如果有修饰符的话; 只能使用static
 *
 *  3 静态代码块
 *     > 可以随着声明输出语句
 *     > 随着类的加载而执行
 *  4 非静态的代码块
 *     > 随着类的创建而执行
 *
 */
class Person{
    String name;
    int age;
    // 非静态的代码块
    {
        System.out.println("我是非静态代码块");
    }

    // 静态的代码块
    static {
        System.out.println("我是静态代码块");
    }


    public void eat(){
        System.out.println("人要吃饭");
    }

    public static void show(){
        System.out.println("我是一个人");
    }

    public Person(){

    }
}
class Student extends Person{

    {
        System.out.println("我是儿子");
    }
}
public class BlockTest {
    public static void main(String[] args) {
//        Person person = new Student();
        Person.show();

    }
}
