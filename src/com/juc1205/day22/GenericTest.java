package com.juc1205.day22;

import org.junit.Test;

import java.util.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/10 14:21
 *
 * 泛型的使用
 * 如果在集合中，创建对象时，没有指定
 */
class Person<T>{
    String name;
    int age;
    private T type;
    public Person(){

    }
    public Person(String name,T type){
        this.name = name;
        this.type = type;
    }

    public T getType(){
        return type;
    }
}

public class GenericTest {

    // 在集合中使用泛型
    @Test
    public void test(){
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    // 在集合中使用泛型
    @Test
    public void test3(){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("Tome",56);
        map.put("Jack",87);
        map.put("Rose",99);
        Set<Map.Entry<String,Integer>> entries =map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test4(){
        Person<String> p = new Person<String>("Tom","Tom");
        Object type = p.getType();
        System.out.println(type);
    }
}
