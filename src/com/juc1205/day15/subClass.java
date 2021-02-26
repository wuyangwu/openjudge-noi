package com.juc1205.day15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 22:42
 */
public class subClass implements CompareA{

    @Override
    public void method2(){

    }

    public static void main(String[] args) {
        subClass subClass = new subClass();

        CompareA.method1();
    }
}
