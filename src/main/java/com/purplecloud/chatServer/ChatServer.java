package com.purplecloud.chatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

//服务端总开关，用于控制服务端的启动和关闭
//服务端启动后使用socket监听端口，等待客户端连接
//服务端接收到客户端连接后，为每个客户端创建一个线程，用于处理客户端的请求
public class ChatServer {
    public static void main(String[] args) {
        ServerSocket socket = null;
        try {
            //创建一个socket对象，用于监听端口
            socket = new ServerSocket(8080);
            while (true) {
                //等待客户端连接
                Socket client = socket.accept();
                //为每个客户端创建一个线程，用于处理客户端的请求
                new Thread(new ChatServerHandler(client,1024)).start();
            }
            //创建一个线程，用于处理客户端的请求

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
