package com.juc1205.day25;

import org.junit.Test;

import java.lang.reflect.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/30 15:59
 */
public class ReflectionTest {

    // 使用反射之前
    @Test
    public void test1(){
        Person person = new Person();
        person.age =1;
        person.show();

        // 不可以在Person类的外部调用Person类中的私有的结构；属性、方法、构造器
    }
    //使用反射
    /**
     *
     *
     *      1.class的理解
     *      使用javac.exe命令对现有的java文件进行编码，编译以后就会得到一个或多个字节码文件
     *      使用java.exe命令对其中的一个字节码进行解释运行。此时就会将此字节码文件对应额java类
     *      加载到内存中。加载到内存中的java类就是一个class的实例。
     *     2.
     *
     * */
    @Test
    public void test2() throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException {

//        Class<Person> clazz = Person.class;
        Class<Person> clazz = (Class<Person>) Class.forName("com.juc1205.day25.Person");
        Person person = clazz.newInstance();

        //2.调用对象的属性
       Field field =  clazz.getField("age");
       field.set(person,1);
        System.out.println(person);

        //3.调用对象的方法:show()
        Method showMethod = clazz.getMethod("show");
        showMethod.invoke(person);


        //通过反射，可以调用person类中的私有的构造器
        Constructor<Person> con = clazz.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        con.newInstance("Tom");

        // 调用私有的属性
        Field field1 = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person,"jerry");
        System.out.println(field.get(person));

        //调用私有的方法
        Method infoMethod = clazz.getDeclaredMethod("info", String.class);
        infoMethod.setAccessible(true);
        infoMethod.invoke(person,"我是钢铁侠");
    }

    /*
    *
    * 问题1：为什么要用反射？什么时候用反射？
    *       反射的动态性，存在不确定的情况
    *
    * 问题2： 反射和类的封装线是否矛盾
    *         不矛盾。
    *          封装性：是否建议调用私有的结构的问题
    *
    *
    * 问题3：以前通过new+构造器的方式创建对象，已经方法属性的调用，与现在的使用反射的方式对比，
    *       以后应该应哪种方式？
    *       使用new+构造器的方式使用的多
    *
    * */

    // 带泛型的父类
    @Test
    public void test5(){
        Class clazz = Person.class;
        Type type = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type[] types = parameterizedType.getActualTypeArguments(); //获取带泛型的父类的泛型参数
        System.out.println(types[0]);
    }

    //调用指定的构造器

}
