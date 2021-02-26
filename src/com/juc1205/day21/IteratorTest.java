package com.juc1205.day21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/4 11:23
 *
 * 如何遍历集合元素
 *      使用迭代器：Iterator
 */
public class IteratorTest {
    @Test
    public void Test(){
        Collection collection = new ArrayList();
        collection.add(new String("AA"));
        collection.add(new Person("Tom",123));
        collection.add(new Object());
        collection.add(1);

        // iterator返回一个迭代器的实例
        Iterator iterator = collection.iterator();
//        for (int i = 0; i<collection.size(); i++){
//            System.out.println(iterator.next());
//        }
/*        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        // 增强for循环，底层依然是迭代器
//        for (Object obj:collection){
//            System.out.println(obj);
//        }
        //


    }
    @Test
    public void Test1(){
        int[] arr = new int[]{1,2,3,4,5,6};
        for (int i: arr){
            System.out.println(i);
        }
    }
}
