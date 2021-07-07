package com.juc1205.day26;

import org.junit.Test;

import java.io.PrintStream;
import java.util.function.Consumer;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/6 15:46
 *
 *
 * lambda表达式的使用
 *      1.lambda表达式的格式
 *      左侧-> 右侧
 *      左侧：lambda形参列表
 *      ->：lambda操作符或箭头操作符
 *      右侧：lambda体，既为重写的接口中的抽象方法的方法体
 *      2.使用前提：针对于只声明了一个抽象方法的接口，
 *
 *      3.lambda表达式，做诶接口的匿名实现类对象出现。
 *
 */
public class LambdaTest1 {

    //语法格式一：无参，无返回值
    @Test
    public void test(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("誓言与谎言的区别");
            }
        };
        runnable.run();

        Runnable runnable1 = () ->{
            System.out.println("一个是说的人当真的，一个是听的人当真了");
        };
        runnable1.run();


        // 语法格式二：lambda需要一个参数，但是没有返回值
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("我爱天安门");
        //****************************************
        Consumer<String> con2 = (String t) -> {
            System.out.println(t);
        };
        con2.accept("我爱天安门");
    }


    // 语法格式四：Lambda若只需要一个参数时，参数的小括号可以忽略
    @Test
    public void test5(){
        //****************************************
        Consumer<String> con2 = (String t) -> {
            System.out.println(t);
        };
        con2.accept("我爱天安门");

        Consumer<String> con3 = (t) -> {
            System.out.println(t);
        };
        con3.accept("我爱天安门");

        Consumer<String> con4 = t -> {
            System.out.println(t);
        };
        con4.accept("我爱天安门");


        //****************************************************方法引用
        PrintStream printStream = System.out;
        Consumer<String> consumer = printStream::print;
        consumer.accept("我爱中国");
    }

    /*
    *
    * 方法引用的使用
    *   1.方法引用可以看做是一个特殊的lambda表达式。
    *   2.方法引用也是一个对象是作为函数式接口的对象
    *   3.方法引用的格式：
    *         对象/类：：方法名
    *   4.具体来说
    *       对象：：非静态方法
    *        类 ：：静态方法
    *        类：：非静态方法
    *
    * */
}
