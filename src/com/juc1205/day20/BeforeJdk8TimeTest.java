package com.juc1205.day20;

import org.junit.Test;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;


/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/2 17:07
 *
 * jdk8 之前的日期时间的api测试
 * 1、System类中的方法：currentTimeMillis():获取
 *
 * 4、SimplerDateFormate:日期的格式化操作
 */
public class BeforeJdk8TimeTest {

    /*
    *
    * java.util.Data
    *           两个构造器和两个方法的使用
    * */
    @Test
    public void Test(){
        Date data1 = new Date();
        System.out.println(data1);
        Date date2 = new Date(35234L);
        System.out.println(date2);


     }

     // 1.calender是一个抽象类，不能实例化
     @Test
    public void Test2(){
         Calendar calendar = Calendar.getInstance();
     }
}
