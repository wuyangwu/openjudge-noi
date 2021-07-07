package com.juc1205.day24;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/30 10:54
 *
 * Tcp使用练习
 */
public class TcpTest2 {

    @Test
    public void client() throws IOException {
        InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
        FileInputStream fis = new FileInputStream(new File(""));
        Socket socket = new Socket(inetAddress,9090);
        OutputStream os = socket.getOutputStream();
        byte[] buffer = new byte[1024];
        int len ;
        while ((len = fis.read(buffer))!= -1){
            os.write(buffer,0,len);
        }
        // 关闭输入端
        socket.shutdownOutput();
        // 接受来自于服务端的反馈
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer1 = new byte[1024];
        while ((len = is.read(buffer1))!= -1){
            baos.write(buffer1,0,len);
        }
        System.out.println(baos.toString());

        os.close();
        fis.close();
        socket.close();
    }


    @Test
    public void server() throws IOException {
        ServerSocket serverSocket = new ServerSocket(9090);
        Socket socket = serverSocket.accept(); //
        FileOutputStream fis = new FileOutputStream(new File(""));
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) != -1){
            fis.write(buffer,0,len);
        }

        // 服务端反馈数据给客户端
        OutputStream bs = socket.getOutputStream();
        bs.write("我收到了你的图片，很帅".getBytes());
    }
}
