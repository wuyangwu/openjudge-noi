package com.juc1205.day16;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/25 18:51
 *
 * ERROR:java虚拟机无法解决的严重问题，如：JVM系统内部错误、资源耗尽严重情况。
 * 比如：StackOverflowError和oom
 * 一般不编写针对性的代码
 *
 *
 */
public class ErrorTest {
    public static void main(String[] args) {
        //栈溢出 java.lang.StackOverflowError
//        main(args);
        byte[] arr = new byte[1024*1024*1024];
        // O

    }
}
