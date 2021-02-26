package com.juc1205.day20;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 10:27
 *
 *  死锁
 *  比较synchronized和lock异同？
 *   相同点：解决了线程的安全问题
 *   不同点，synchronized需要指定同步监视器。保证此同步监视器是唯一的
 *          Lock的实例需要保证是唯一的
 *          Lock必须显示调用unlock()方法，才会释放
 */

public class DeadLockTest {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        new Thread(() ->{
            synchronized (s1){
                s1.append("a");
                s2.append("1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s2){
                    s1.append("b");
                    s2.append("2");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();

        new Thread(() ->{
            synchronized (s2){
                s1.append("a");
                s2.append("1");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (s1){
                    s1.append("b");
                    s2.append("2");
                    System.out.println(s1);
                    System.out.println(s2);
                }
            }
        }).start();

    }
}
