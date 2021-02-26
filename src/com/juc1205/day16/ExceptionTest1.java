package com.juc1205.day16;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/25 21:30
 *
 * 异常的处理，java提供了两种方式，用于异常的处理
 *
 * 方式一、try-catch-finally
 * 方式二、throws
 *
 *  Java提供了异常处理的方式：抓抛模型
 *  过程一、“抛”
 *      程序正在正常的执行过程中，一旦出现异常，就会在异常代码处生成对应异常类的对象，并将此对象抛出
 *      对象一旦抛出，在没有处理异常的情况下，程序就不在向下执行
 *  过程二：“抓”
 */

public class ExceptionTest1 {

//    @Test
    public static int test1(){
        try{
            int i= 10;
            int j =0;
            System.out.println(i/j);
            return 3;
        }catch (ArithmeticException e){
            System.out.println("123213");
//            e.printStackTrace();
            return 1;
        }finally {
            System.out.println("我是要被执行的代码");
            return 2;
        }
    }



    public static void main(String[] args) {
        System.out.println(test1());
    }
}
