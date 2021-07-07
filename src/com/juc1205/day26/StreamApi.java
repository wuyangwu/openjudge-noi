package com.juc1205.day26;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/4/7 10:52
 *
 *  StreamApi是对java中现有api的重要补充
 *     如果你需要对集合进行复杂的比如：查找、过滤、映射等操作，可以考虑使用Stream api
 *
 *  2.集合，内存中的多个数据，可以考虑使用集合存储
 *     Stream api；针对于已经在内存中存储的集合数据，进行操作。
 *
 *  3.如何使用Stream api，步骤如下
 *     1-创建stream
 *       一个数据源，获取一个流
 *     2-中间操作
 *       一个中间操作链，对数据源的数据进行处理
 *     3-终止操作（终端操作）
 *       一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 */
public class StreamApi {

    // 方式一、调用集合的Stream（）
    @Test
    public void test1(){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

    }
    // 方式二、调用Arrays的Stream（）
    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5};
        IntStream stream = Arrays.stream(arr);
    }
    //方式三：Stream的静态方法of(T......t)
    @Test
    public void test3(){
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.forEach(System.out::println);
    }
}
