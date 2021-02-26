package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 17:24
 *
 * abstract关键字的使用
 *
 * 1. abstract:抽象类的使用
 *
 * 2可以用来修饰：类和方法
 *
 * 3 abstract修饰类：抽象类
 *      抽象类不可以实例化
 *      抽象类中一定要有构造函数
 *      子类继承抽象类以后，如果重写了所有的抽象方法，则此类就可以实例化
 * 4 abstract修饰方法；抽象方法
 *      抽象类中不一定需要抽象方法
 *      抽象方法必须在抽象类中
 */

abstract class Creature{
    public abstract void breath();
}

abstract class person extends Creature{
    String name;
    int age;

    public person(){

    }

    public person(String name) {
        this.name = name;
    }

    public person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public abstract  void eat();

    public void walk(){
        System.out.println("人要工作");
    }
}

class student extends person{
    public student() {
    }

    public student(String name) {
        super(name);
    }

    public student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生要吃");
    }

    @Override
    public void walk(){
        System.out.println("学生要工作");
    }

    @Override
    public void breath() {
        System.out.println("学生要呼吸");
    }
}


public class AbstractTest {
    public static void main(String[] args) {
        person person = new student();
        person.eat();
        person.walk();
        person.breath();
    }
}


