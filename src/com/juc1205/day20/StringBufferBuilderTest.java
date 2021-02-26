package com.juc1205.day20;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 16:18
 */
public class StringBufferBuilderTest {
    /*
    *面试题：
    *   String\StringBuffer\StringBuilder三者的异同？
    *   String:不可变的字符序列
    *   StringBuffer: 可变的字符序列：jdk1.0声明，线程安全的,效率低
    *   StringBuilder: 可变的字符序列： jdk1.5声明，线程不安全，效率高
    *
    *   String str = new String();
    *   当底层的长度不够时扩容为原来的*2 +2
    *
    *
    *   总结:常用的方法
    *   增 append()
    *   删 delete(int start, int end)
    *   改 setCHart(int n, char ch),replace(int start,int end,String str)
    *   查 chart(int n)
    *   插 insert
    *   长度 length()
    *   遍历
    * */

    @Test
    public void Test(){
        StringBuilder s = new StringBuilder();
        s.append("abc");
        System.out.println(s.toString());
        System.out.println(s.length());
    }


}
