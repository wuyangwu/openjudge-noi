package com.juc1205.day26;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/7 13:55
 *
 *
 *  Stream的一系列的中间操作
 *
 */
public class StreanApiTest2 {

    // 映射
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        // map(Function f) --接受一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        // 练习：获取员工姓名长度大于3的员工的姓名
    }
    // 排序
    @Test
    public void test5(){
        // sorted()--自然排序
        List<Integer> list = Arrays.asList(3,4,6,2,6,8,3,2,4,6,8,5);
        list.stream().limit(2).forEach(System.out::println);
        System.out.println(list);
        // sorted(Comparator ) -- 定制排序
    }
}
