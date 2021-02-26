package com.juc1205.day20;

import org.junit.Test;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 15:05
 *
 * 字符串String的使用
 *      1、申明为final的，不可被继承
 *      2、实现了Serializable接口；可序列化
 *      3、实现了Comparable接口；字符串对象比较大小
 *      4、特点；不可变性
 *             > 当给字符串重新赋值时，需要字符串常量池中重新开辟一块空间保存新的字符串数据
 *
 *      5、如果通过字面量的方式定义一个字符串，此字符串数据声明在字符串常量池中
 *
 *
 */

class Person{
    String name;
    int age;
}
public class StringTest {


    /**
     * 凡是有变量参与的字符串连接操作，在赋值时，都需要重新开辟一块空间保存其数据值
     *
     * intern():当调用字符串的intern()方法后，我们会在字符串常量池中声明此字符串，如果已经存在，则返回已经存在的字符串常量的地址
     */
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "word";
        String s3 = "helloword";
        String s4 = s1+s2;
        String s5 = s1+"word";
        String s6 = "hello"+s2;
        String s7 ="hello"+"word";
        String s8 = (s1+s2).intern();
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);// true
        System.out.println(s5 == s6);// false
        System.out.println(s4 == s5);// false
        System.out.println(s4 == s6);// false
        System.out.println(s4 == s7);// false
        System.out.println(s6 == s7);// false
    }


    /*
    * String s2 = new String("hello")创建了几个对象？
    * 涉及到在堆空间开辟空间保存new的对象结构，另外hello数据同样需要考虑在字符串常量池中创建
    * */
    @Test
    public void Test2(){
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); //false

        Person person = new Person();
        person.name="Tom";
        Person person1 = new Person();
        person1.name= "Tom";
        System.out.println(person.name == person1.name);
    }



    @Test
    public void Test1(){
        String s1 = "hello";
        String s2 = "hello";
        s1 = "hi";
        System.out.println(s1); // hi
        System.out.println(s2); // hello
        String s3 = "北京";
        String s4 = "北京";
        s3 += "changping";
        System.out.println(s3);
        System.out.println(s4);

        String s5 = "haha";
        String s6 = s5.replace('a','e');
        System.out.println(s5);
        System.out.println(s6);
    }

}
