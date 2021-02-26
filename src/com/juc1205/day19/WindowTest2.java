package com.juc1205.day19;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/1 17:18
 */

class Windws2 extends Thread{

    @Override
    public void run(){
        while (true){
            synchronized (Windws2.class){ // this 是否是惟一的

            }
        }
    }

}

public class WindowTest2 {
    public static void main(String[] args) {
        Windws2 w1 = new Windws2();
        Windws2 w2 = new Windws2();
        Windws2 w3 = new Windws2();
        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");
        w1.start();
        w2.start();
        w3.start();

    }
}
