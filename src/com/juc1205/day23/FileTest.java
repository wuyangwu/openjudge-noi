package com.juc1205.day23;

import org.junit.Test;

import java.io.File;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/10 16:46
 *
 * File类的使用
 * 1.File类的一个对象代表着一个文件目录或文件
 * 2.File中定义了关于文件或文件目录的新建、删除、长度、文件或文件目录名、重命名等方法。
 *      但是，并不包含操作文件内容的方法。要想操作文件的内容，我们就需要学习IO流
 * 3.File类的文件对象常常作为参数传递到IO流的构造器中，表示读取数据的来源或写出数据的目标地址
 *
 */
public class FileTest {



    @Test
    public void test1(){
        File file1 = new File("");
    }
}
