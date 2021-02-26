package com.juc1205;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/22 17:11]
 *
 * 线程不安全
 * 1. 故障现象
 *    java.util.ConcurrentModificationException
 * 2 导致原因
 *
 * 3 解决方法
 *   3.1 new Vector<>()
 *   3.2 Collections.synchronizedList(new ArrayList<>())
 *   3.3  new CopyOnWriteArrayList<>()
 */
public class NotSafeDemo03 {
    public static void main(String[] args) {
        // ArrayList 懒加载初始值10 是new了一个Object类型为10的数组  HashMap初始值16
        // 10扩容到原值的一半 第一次扩容到15, 用arrays.copyof进行赋值搬家, 第二次扩容22
        // hashMap扩容是原值的一倍 第一次扩容到32
        // ArrayList是线程不安全，写一个ArrayList的线程不安全的代码
        // HashSet底层的数据结构是HashMap
    }

    public static void mapNotSafe(){
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < 30; i++){
            new Thread(
                    ()->{
                        map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));
                        System.out.println(map);
                    },String.valueOf(i)
            ).start();
        }
    }

    public static void setNotSafe(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 30; i++){
            new Thread(
                    ()->{
                        set.add(UUID.randomUUID().toString().substring(0,8));
                        System.out.println(set);
                    },String.valueOf(i)
            ).start();
        }
    }

    public static void listNotSafe(){
        //List<String> list = new ArrayList<>(); // 线程不安全
//        List<String> list  =  Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 30; i++){
            new Thread(
                    ()->{
                        list.add(UUID.randomUUID().toString().substring(0,8));
                        System.out.println(list);
                    },String.valueOf(i)
            ). start();
        }
    }
}
