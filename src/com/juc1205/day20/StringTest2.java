package com.juc1205.day20;

import org.junit.Test;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 16:09
 *
 * String 于其他结构之间的转换
 *
 */
public class StringTest2 {

    @Test
    public void test1(){
        //基本类型、包装类----->String
        int num1 = 10;
        String numStr = num1+ "";
        String str = String.valueOf(num1);
        System.out.println(numStr == str);
    }
}
