package com.juc1205.day21;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/6 14:11
 *
 *  |--Collection接口：存储的是一个一个的数据
 *  *          |--List接口 存储的是有序的，可重复的数据  -----“动态”数组
 *  *              实现类|--Vector/ArrayList/LinkedList
 *                      |--ArrayList:主要实现类，线程不安全,效率高，底层使用的是Object[]存储
 *                      |--Vector: 古老实现类，线程安全，效率低底层使用的是Object[]存储
 *                      |--LinkedList:底层使用双向链表存储，对于频繁的插入和删除，建议食用此类，效率较高
 */
public class LinkTest {
    @Test
    public void Test(){

    }
}
