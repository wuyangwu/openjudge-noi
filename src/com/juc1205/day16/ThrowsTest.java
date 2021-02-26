package com.juc1205.day16;

import java.nio.file.FileAlreadyExistsException;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/25 23:17
 *
 * 异常处理的方式二、使用throws
 */
public class ThrowsTest {

    public void method3(){
        try {
            method1();
        } catch (FileAlreadyExistsException e) {
            e.printStackTrace();
        }
    }

    public void method1() throws FileAlreadyExistsException {

    }
}
