package com.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/22 16:09
 */
public class TalkClient4Byte {
    private Socket socket;
    private SocketAddress address;

    public TalkClient4Byte(){
        socket = new Socket();
        try{
           socket.connect(new InetSocketAddress("127.0.0.1",5020),1000);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
//    getInputStream方法可以得到一个输入流，客户端的Socket对象上的getInputStream方法得到输入流其实就是从服务器端发回的数据。
//    getOutputStream方法得到的是一个输出流，客户端的Socket对象上的getOutputStream方法得到的输出流其实就是发送给服务器端的数据
    public void talk(){
        try{
            // 封装输入流
            InputStream os = new DataInputStream(System.in);
            byte[] b = new byte[1];
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            while (-1 != os.read(b)) {
                dos.write(b); // 发送给客户端
            }
            dos.flush();
            dos.close();

        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                socket.close();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        TalkClient4Byte talkClient4Byte = new TalkClient4Byte();
        talkClient4Byte.talk();
    }
}
