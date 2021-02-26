package com.juc1205.day20;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 10:48
 *
 * 线程的通信
 *  wait() 程序一旦执行到这个方法，当前线程进入阻塞状态，需要等待被唤醒
 *  notify(): 程序一旦执行到此方法，就需要唤醒被wait的线程
 *  notifyAll()
 *
 *  说明：
 *      1、wait() notify() notifyAll(),这三个方法必须使用在同步方法或同步代码块中。
 *      2、此wait(),
 *
 *
 *
 *  面试题：sleep()
 */

class NumberPrint implements Runnable{

    int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this){
                if(number <= 100){
                    notify(); //将被wait的线程唤醒
                    System.out.println(Thread.currentThread().getName()+"  :  "+number);
                    number++;
                }
                try {
                    wait(); //使得当前线程阻塞。并且释放同步监视器
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class CommunicationTest {
    public static void main(String[] args) {
        NumberPrint numberPrint = new NumberPrint();
        Thread w1 = new Thread(numberPrint);
        Thread w2 = new Thread(numberPrint);
        w1.setName("线程1");
        w2.setName("线程2");
        w1.start();
        w2.start();
    }
}
