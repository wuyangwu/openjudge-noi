package com.juc1205.day18;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/29 15:31
 */

class OddThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<=100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"  : "+ i);
            }
        }
    }
}

class EvenThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<=100;i++){
            if(i%2 ==0){
                System.out.println(Thread.currentThread().getName()+"  : "+ i);
            }
        }
    }
}

public class ThreadExer {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();

    }
}
