package com.juc1205.day18;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/29 14:58
 *
 * 创建多线程的方式一、继承Thread类的方法
 *1、创建一个继承于Thread类的子类
 * 2、重写Thread类的Run()
 * 3、创建子类对象
 * 4、调用线程的start()
 */
// 1、创建一个继承Thread的子类
class evenThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i<= 100; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        evenThread evenThread = new evenThread();
        evenThread.start();
    }
}
