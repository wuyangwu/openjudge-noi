package com.juc1205.day15;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/24 22:40
 *
 * JDK8种说明接口种可以定义静态方法和默认方法
 * 静态方法：声明为public static的
 * 默认方法：声明为public defalut的
 * 现类可以重写接口的默认方法
 * jdk 9 种
 *4 如果父类和接口定义了同名同参数的方法，子类在没有重写此方法的情况下是类优先原则
 *
 */
public interface CompareA {
    public default void method2(){
        System.out.println("CompareA:南京");
    }
    public static void method1(){
        System.out.println("CompareA:北京");
    }
}
