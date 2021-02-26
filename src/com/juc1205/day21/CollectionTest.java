package com.juc1205.day21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/4 9:30
 *
 * java 集合框架
 *      |--Collection接口：存储的是一个一个的数据
 *          |--List接口 存储的是有序的，可重复的数据  -----“动态”数组
 *              实现类|--Vector/ArrayList/LinkedList
 *          |--set接口 存储的是无序的，不可重复的数据  -----“高中的”集合
 *             实现类 |--HashSet/LinkedHashSet/TreeSet
 *      |--Map接口：存储的是一对一对的数据：key-value
 *              |--HashMap/LinkedHashSet/TreeMap/Hashtable/Properties
 *
 * 6、本章对大家的要求
 *      层次一、能够灵活的根据要存储的多个数据的特点，选择对应接口的主要实现类，实现数据的操作
 *      层次二、区分接口下的不同实现类的区别
 *      层次三、接口中具体的某些实现类的底层数据结构
 *
 *      数据结构：数据之间的逻辑关系，数据之间的存储结构
 */

class Person{
    private String name;
    private int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class CollectionTest {
    @Test
    public void Test(){
        Collection collection = new ArrayList();
        // add添加
        collection.add("AA");
        collection.add(new Object());
        collection.add(1);//自动装箱
        System.out.println(collection);
    }

    @Test
    public void Test2(){
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(new Object());
        collection.add(1);
        collection.add(new Person("Tom",123));
        //是否包含 , 调用了obj所在类的equal方法
        System.out.println(collection.contains(new Person("Tom",123)));
        // containAll
//        System.out.println(collection.containsAll());
        //8、remove(Object obj):从当前集合中将obj删除
    }

    @Test
    public void Test3(){
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(new Object());
        collection.add(1);
        collection.add(new Person("Tom",123));
        //11、equals:判断当前集合对象与obj是否相同
        System.out.println(collection.equals(new Person("Tom",123)));
        //12、hashCode()：返回当前对象的hash值
        System.out.println(collection.hashCode());
        //13.toArray()转换成数组
        Object[] array  = collection.toArray();
        System.out.println(Arrays.toString(array));
        //14、数组转成集合
    }
}
