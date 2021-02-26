package com.socket;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/1/22 15:36
 */
public class TalkServer4Byte {
    private ServerSocket serverSocket;
    private int port =5020;

    public TalkServer4Byte(){
        try{
            serverSocket = new ServerSocket(port);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void talk(){
        System.out.println("监控端口："+port);
        Socket socket = null;
        while (true){
            try{
                // 每接收一个请求创建一个实例
                socket = serverSocket.accept();
                System.out.println("连接客户端："+socket.getRemoteSocketAddress());
                // 装饰流BufferedReader封装输入流（接收客户端的流）
                BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
                DataInputStream dis = new DataInputStream(bis);
                byte[] bytes = new byte[1]; // 一次读取一个byte
                String ret = "";
                while (dis.read(bytes) != -1){
                    ret += bytesToHexString(bytes) + " ";
                    if(dis.available() == 0){
                        doSomething(ret);
                    }
                }

            } catch (IOException e){
                System.out.println(e.getMessage());
            }finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void doSomething(String ret){
        System.out.println(ret);
    }

    public static  String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null|| src.length <= 0){
            return null;
        }
        for (int i = 0; i< src.length;i++){
            int v = src[i]  & 0xff;
            String hv = Integer.toHexString(v);
            if(hv.length() < 2){
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }

    public static String BytesHexString(byte[] b){
        String ret = "";
        for (int i = 0; i< b.length; i++){
            String hex = Integer.toHexString(b[i] & 0xff);
            if(hex.length() == 1){
                hex = '0'+hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }

    public static void main(String[] args) {
        TalkServer4Byte server4Byte = new TalkServer4Byte();
        server4Byte.talk();
    }
}
