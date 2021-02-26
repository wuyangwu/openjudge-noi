package com.juc1205.day20;

import org.junit.Test;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 16:03
 */
public class StringMethodTest {





    @Test
    public void Test(){
        String s1 = "hello";
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        s1="";
        System.out.println(s1.isEmpty()); // 空串
    }
}
