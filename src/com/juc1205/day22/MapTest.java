package com.juc1205.day22;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/9 15:43
 */

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  |--Map接口：存储得失一对一对的数据：key-value
 *         |-- HashMap主要实现类 线程不安全的，效率高;允许添加null的key或null的value
 *             |--- LinkedHashMap：是HashMap的子类，可以实现按照添加的顺序实现遍历。（因为使用了一对双向链表记录添加元素的先后顺序，对于频繁的便利操作，建议使用此类）
 *         |-- TreeMap：可以按照元素key的指定的属性的大小实现遍历。底层使用红黑树实现
 *         |-- Hashtable:古老类线程安全，效率低；不允许添加null的key或null的value
 *             |-- Properties：常用来处理文件。key和value都是String类型。
 *
 *          HashMap的底层实现：
 *              jdk7:数组+单向链表
 *                  HashMap map = new HashMap();//Entry[] table = new Entry[16];
 *                  map.put(key1,value1);// key1,value1会封装在一个entry对象中。将次对象存放到table数组中
 *                  将key1，value1添加到table中，首先根据key1所在类的hashCode()方法，计算key1的哈希值1，然后使用某种算法，得到哈希值2
 *                  哈希值2再使用indexof()方法得到其在底层table数组中的存放位置；index。（0《=index《=15）
 *                  如果index位置上没有元素，则key1，value1直接添加成功。
 *                  如果index位置上有元素key2，value2，则比较key1和key2的哈希值
 *              说明：添加成功操作1；将key1，value1存放到数组的位置上
 *                  添加成功操作2，添加成功操作3；将key1，value1添加到链表上。默认的临界值为15*0.75 = 12
 *                  默认扩容为原来的2倍
 *              扩容的情况：当添加的数据达到临界值则进行扩容
 *
 *
 *
 *              jdk8:数组+单向链表+红黑树
 *
 * 三、Map的结构
 *      Map中的key是无序的、不可重复的。key构成的集合是Set
 *      Map中的value是无序的、可重复的。value构成的集合是Collection
 *      Map中的一个键值对构成一个entry
 *      Map中的entry是无序的、不可重复的。entry构成的
 * 四、Map中的常用方法
 *
 * */
public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
    }
}
