package com.juc1205.day16;

import org.junit.Test;

import javax.xml.crypto.Data;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/25 18:57
 *
 * Exception: 其他因编程错误或偶然因素
 * java.lang.Throwable
 *      |--java.lang.Error:错误，不编写针对性代码
 *      |--java.lang.Exceptionn:异常，使用针对性的代码进行处理
 *          |--编译时异常（非RuntimeException）在执行javac.exe命令时可能出现的异常
 *          |--运行时异常（RuntimeException）在执行java.exe命令时可能出现的异常
 *              |--Input
 *
 *
 * Exception:
 */
public class ExceptionTest {


    // ArrayIndexOutOfBoundsException
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    @Test
    public void test2(){
//        int[][] arr1 = new int[4][];
//        System.out.println(arr1[0][0]);
//
        Data data = null;
        System.out.println(data.toString());
    }
    @Test
    public void test3(){

    }

}
