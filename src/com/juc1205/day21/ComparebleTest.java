package com.juc1205.day21;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/2/3 16:06
 *
 *      1、说明：
 *        ==
 *      2、默认情况下，引用数据类型的变量是不可以比较大小的。但是在实际开发中，我们又有这样的需求，如何实现呢？
 *          实现方法一、自然排序：Compareble
 *          实现方法二、定制排序：Comparetor
 *      3、自然排序：
 */
class Goods implements Comparable<Goods>{
    private String name;
    private double price;
    public Goods(){

    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    /*
    *
    * 如果比较两个对象的大小，需要调用如下方法
    * @return
    *  如果返回值为正数，表示调用此方法的对象大
    *   如果返回值为负数，表示调用此方法的对象小
    *  如果返回值为0，表示两个对象一样大
    *
    * 按照价格从低到高的方式
    * */
    @Override
    public int compareTo(Goods goods) {
        if(this.price == goods.price){
           return this.name.compareTo(goods.name);
        }else {
            if (this.price - goods.price>0){
                return 1;
            }
            return -1;
        }
    }
}
public class ComparebleTest {

    @Test
    public void Test(){
        String[] arr = new String[]{"CC","DD","MM","AA","GG","JJ","ZZ"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void Test2(){
       Goods good1 =  new Goods("samsungbote10",7999);
       Goods good2 =  new Goods("huaweimate30",5999);
       Goods good3 =  new Goods("lenovo",1999);
       Goods good4 =  new Goods("xiaomi9",2999);
       Goods good5 =  new Goods("vivox27pro",4999);
       Goods good6 =  new Goods("oppofindx",2999);

       Goods[] arr = new Goods[]{good1,good2,good3,good4,good5,good6};
       for (int i = 0; i< arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    /*
    *
    *  定制排序：Comparator
    * */
    @Test
    public void Test3(){
        String[] arr = new String[]{"CC","DD","MM","AA","GG","JJ","ZZ"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, new Comparator<String>() {
            //通过此方法重写，指明对象的排序方式
            @Override
            public int compare(String o1, String o2) {
                if (o1 instanceof String && o2 instanceof String){
                   return -o1.compareTo(o2);
                }
                return 1;
            }
        });
    }
}
