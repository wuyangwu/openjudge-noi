package com.juc1205.day22;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/10 11:30
 */
public class propertiesTest {
    @Test
    public void test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc.properties"));
        String user = properties.getProperty("user");
        System.out.println(user);
    }
}
