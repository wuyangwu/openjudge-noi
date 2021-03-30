package com.juc1205.day24;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/30 10:03
 */
public class TcpTest {

    @Test
    public void client() throws IOException {
        // 1.创建socket的实例
        InetAddress address = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(address,9090);

        // 2.获取输出流，写出数据
        OutputStream os =  socket.getOutputStream();
        os.write("hello,I am client".getBytes());
        // 3.资源关闭
    }

    @Test
    public void server() throws IOException { // 服务端
        //1.创建serversocket的实例
        ServerSocket serverSocket = new ServerSocket(9090);
        // 2.接受来自于客户端的socket
        Socket socket =  serverSocket.accept();
        // 3. 获取输入流，读取输入流中的
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[20];
        int len ;
        while ((len = is.read(bytes))!=-1){
            String str = new String(bytes,0,len);
            System.out.println(str);
        }
        // 4.资源关闭
        is.close();
        socket.close();
        serverSocket.close();
    }
}
