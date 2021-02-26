package com.juc1205.day20;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 11:37
 *
 * 分析：
 *  1、是否是多线程问题？
 *  2、会出现线程安全问题吗？
 */

class Clerk{
    private int productCount = 0 ; // 产品的数量

    public synchronized void addProduct(){
        if(productCount>=20){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            productCount++;
            System.out.println(Thread.currentThread().getName()+" :  "+"生产了第"+productCount+"个产品");
            notify();
        }
    }

    public synchronized void reduceProduct(){
        if(productCount<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(Thread.currentThread().getName()+" :  "+"消费了第"+productCount+"个产品");
            productCount--;
            notify();
        }
    }
}

class Consumer implements Runnable{

    Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  开始消费。。。。。。。  ");
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.reduceProduct();
        }
    }
}

class Producer implements Runnable{

    Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"  开始生产");
        while (true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

public class produceConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Consumer consumer = new Consumer(clerk);
        Producer producer = new Producer(clerk);
        new Thread(producer,"生产者").start();
        new Thread(consumer,"消费者").start();
    }
}
