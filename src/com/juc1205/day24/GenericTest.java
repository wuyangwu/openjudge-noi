package com.juc1205.day24;

import org.junit.Test;

import java.util.List;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/29 10:07
 *
 * 通配符
 */
public class GenericTest {
    @Test
    public void test1(){
        List<?> list1 = null;
        List<Object> list = null;
        List<Person> list2 = null;
        List<Student> list3 = null;
        list1 = list2;
        list1 = list3;
        // 有限制条件的通配符的使用
        List<? extends Person> list4 = null;
        List<? super Person> list5 = null;
    }
}
