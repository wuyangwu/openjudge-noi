package com.juc1205.day18;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/29 16:52
 *
 *  使用继承的Thread类的方法创建多线程
 *
 *  例题：开启三个窗口售票，总票数为100张。
 *  1、出现的原因，当一个线程在售票时，在没有操作完ticket的情况下，其他线程参与进来
 *  3、解决线程的安全问题：必须保证一个线程操作按ticket以后，其他线程才能参与进来
 *  4、java如何解决线程安全问题
 *              方式一、同步代码块
 *                      synchronized(同步监视器){
 *                          需要同步的代码
 *                      }
 *              说明：
 *                  1、共享数据：多个线程共同操作的数据
 *                  2、需要被同步的代码，即为操作共享数据的代码
 *                  3、同步监视器，俗称锁，任何类的对象都可以充当同步监视器,多个线程共用同一个线程监视器
 *              方式二：同步方法
 *
 */
class Window extends Thread{
   static int ticket = 100;
    Object object = new Object();

    @Override
    public void run(){
        while (true){
            synchronized (object.getClass()){
                if (ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" 开始售票，票号为:"+ticket);
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();
        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");
        window1.start();
        window2.start();
        window3.start();
    }
}
