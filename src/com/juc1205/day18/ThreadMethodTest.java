package com.juc1205.day18;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/29 15:43
 *
 * 线程中的常用方法
 * 1.start()：启动线程；并且调用线程的run方法
 * 2.run方法是要被重写的方法，创建的线程真正要执行的操作
 * 3.currentThread：获取当前正在执行的线程
 * 4.getNme(); 获取当前线程的名字
 * 5、setName：
 * 6、sleep(long mill) 让当前调用此方法的线程睡眠指定的毫秒数
 * 7、yield():线程一旦执行这个方法就释放cpu的使用权
 * 8、join():在线程a中调用线程b的jion（），一旦执行此方法，线程a进入阻塞状态，线程b执行，直到线程b执行结束，结束阻塞，继续执行
 * 9、stop（）：当前线程停止此方法已经过时，一旦执行此方法，当前线程停止
 * 10、isAlive():当前线程是不是还活着
 *
 * 关于线程的优先级的设置
 *      setPriority(int priority):设置线程的优先级
 *      getPriority()；获取当前线程的优先级
 * 2.可以设置线程的优先级
 *
 *
 */
class EvenThreads extends Thread{

    public EvenThreads(){
    }

    public EvenThreads(String name){
        super(name);
    }
}
public class ThreadMethodTest {
    public static void main(String[] args) {

    }
}
