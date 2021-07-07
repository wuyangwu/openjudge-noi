package com.juc1205.day24;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/30 15:07
 */
public class UDPTest {

    @Test
    public void send() throws IOException { // 发送端
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket datagramPacket = new DatagramPacket("我是要发送的炮弹".getBytes(),0,"我是要发送的炮弹".getBytes().length, InetAddress.getByName("127.0.0.1"),9090);
        socket.send(datagramPacket);
        socket.close();
    }

    @Test
    public void receive() throws IOException {//接收端
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buf = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf,0,buf.length);
        socket.receive(datagramPacket);
        String str = new String(datagramPacket.getData(),0,datagramPacket.getLength());
        System.out.println(str);
        socket.close();
    }
}
