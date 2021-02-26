package com.juc1205.day17;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/26 23:13
 *
 * 1.Annotation：是javajdk5.0的新特性
 * 2.理解
 *      Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。
 *      通过使用Annotation，程序员可以在不改变原有的逻辑的情况下，在源文件中嵌入一些补充信息
 * 3.Annotation的举例
 * 举例一、生成文档相关的注解
 * 举例二、
 *      @Override： 限量重写父类方法，该注解只能用于方法
 *      @Deprecated: 用于表示所修饰的元素（类，方法等）已过时。通常是因为所修饰的结构危险或存在更好的选择
 *      @SuppressWarnings: 抑制编译器警告
 *  举例三、跟踪代码的依赖性,实现替代配置文件功能
 *
 * 4. 元注解
 *      jdk5.0 jdk的元Annotation用于修饰其他的Annotation定义
 *      @Retention: 指明了所修饰的注解的生命周期
 *          > SOURCE:不会保留在字节码文件中
 *          > CLASS: 会保留在字节码文件中，但是运行时不会加载到内存中
 *          > RUNTIME: 运行时也会加载在内存中，可以使用反射进行获取
 *      @TARGET: 指明所修饰的注解可以用来修饰哪些结构
 *      *******************************以上两个元注解是我们自定义注解时所需要的考虑的**********************************
 *      @DOCUMENTED: 用于指定该元Annotation修饰的Annotation类将被javadoc工具提取成文档
 *      @INHERITED: 被它所修饰的Annotation将具有继承性
 * 6 反射获取注解信息信息，暂时不讲，放到反射章节讲
 *
 * 7.java8注解的新特性
 *      1、重复注解
 *
 *      2、类型注解
 */
class Person{
    public void walk(){
        System.out.println("人走路");
    }
}
class Student extends Person{
    @Override
    public void walk(){

    }
}
public class AnnotationTest {



}
