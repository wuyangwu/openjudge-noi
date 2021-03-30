package com.juc1205.day22;

import org.junit.Test;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/9 14:23
 */
public class OtherClass {
    @Test
    public void test1(){
        String javaVerion = System.getProperty("java.home");
        System.out.println(javaVerion);
    }
}
