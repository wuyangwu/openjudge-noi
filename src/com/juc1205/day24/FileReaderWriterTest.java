package com.juc1205.day24;

import org.junit.Test;

import java.io.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/29 10:43
 *
 *
 * 抽象基类                节点流(文件流)                    缓冲流(处理流的一种)
 * InputStream
 * OutputStream
 * Reader               FileReader
 * Writer
 *
 * 说明：
 *      虽然涉及到的流非常多，但是从输入、输出的角度看，都是以此标准的的方式实现的。
 *
 */
public class FileReaderWriterTest {
    @Test
    public  void test() throws IOException {
        // 1.创建流以及对应的文件
        File file = new File("");
        FileReader fileReader = new FileReader(file);
        //2.具体的读取的过程
            fileReader.read();

        //3.关闭资源：流
        fileReader.close();
    }

    /*
    *
    * 对于输入流来讲，读取的文件一定要存在。否则报文件不存在错误
    * */
    @Test
    public void test2() throws IOException {
        File file = new File("");
        FileWriter fileWriter = new FileWriter(file);

        // 2.具体的写出的过程
        fileWriter.write("对不起，我是警察\n");
        fileWriter.write("没关系，我是卧底");

        fileWriter.close();
    }


    // 不能使用字符流处理文本文件
    //
    @Test
    public void test3() throws IOException {
        File fileReader = new File("");  // 读
        File fileWriter = new File(""); // 写
        FileInputStream fr = new FileInputStream(fileReader);
        FileOutputStream fw = new FileOutputStream(fileWriter);
        byte[] cbuf  = new byte[1024];
        int len;
        while ((len = fr.read(cbuf))!= -1){
            fw.write(cbuf,0,len);
        }

    }

    @Test
    public void test4(){
        System.out.println(new File("").getPath());
    }

}
