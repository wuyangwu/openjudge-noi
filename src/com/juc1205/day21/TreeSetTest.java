package com.juc1205.day21;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/9 14:46
 */
public class TreeSetTest {
    // 要求Treeset中添加的数据，必须是同一个类创建的对象
    // 向TreeSet中添加的数据，需要指明排序方式：自然排序，定制排序
    @Test
    public void test1(){
        Set set = new TreeSet();

        set.add(34);
        set.add(3);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }


}
