package com.juc1205.day25;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/30 15:51
 */
public class Person {
    private String name;
    public int age;
    public Person(){
        super();
    }

    public Person(String name , int age){
        super();
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        super();
        this.name = name;
    }

    public void show(){
        System.out.println("我是一个好人");
    }

    private void info(String secert){
        System.out.println("我有一个小秘密"+secert);
    }
}
