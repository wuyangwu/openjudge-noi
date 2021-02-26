package com.juc1205;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 15:31
 *
 * 一共有23个设计模式
 * 单例（单子，）模式 */
public class 设计模式 {

    public static void a(int k){
        System.out.println(k);
    }

    public static void main(String[] args) {
        int k =0;
        a(k++);
    }
}
