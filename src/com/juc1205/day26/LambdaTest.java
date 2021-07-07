package com.juc1205.day26;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/6 15:21
 */
public class LambdaTest {
    @Test
    public void test1(){
        // 提供接口的匿名实现类的对象
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱天安门");
            }
        };
        runnable.run();

        //******************Lamdba表达式*********************
        Runnable runnable1 = ()->{
            System.out.println("我爱故宫");
        };
        runnable1.run();
    }

    /**
     *
     *
     *
     **/

    @Test
    public void test2(){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1,o2);
        comparator.compare(1,2);

        Comparator<Integer> comparator1 = (Integer o1, Integer o2) ->{
            return Integer.compare(o1,o2);
        };

        //**************方法引用************************
        Comparator<Integer> com3 = Integer::compareTo;
    }
}
