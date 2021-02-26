package com.juc1205.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/28 10:31
 */

class a{
    static class b implements Runnable{

        // 创建线程池
        public static ExecutorService es = Executors.newCachedThreadPool();

        private int a = 1;
        private  static int b =1;
        b(){
            System.out.println("222");
        }
        @Override
        public void run() {
            System.out.println((++a)+"  "+Thread.currentThread().getName()+"     "+(b++));
        }
    }
}

public  class   leizhonglei {

    public static void main(String[] args) {

        for (int i = 0; i< 5;i++){
            a.b b1 = new a.b();
            a.b.es.execute(b1);
        }
    }



}
