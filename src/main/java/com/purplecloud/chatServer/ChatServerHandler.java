package com.purplecloud.chatServer;

import com.alibaba.fastjson2.JSON;
import com.purplecloud.bean.Message;
import com.purplecloud.protocol.MyProtocol;
import com.purplecloud.util.GetProtocol;

import java.io.*;
import java.net.Socket;

public class ChatServerHandler implements Runnable{
    Socket client;
    int maxInput = 1024;

    public ChatServerHandler() {
    }

    public ChatServerHandler(Socket client, int maxInput) {
        this.client = client;
        this.maxInput = maxInput;
    }

    @Override
    public void run() {
        //处理客户端的请求
        //1. 读取客户端的请求
        try {
            MyProtocol protocol = GetProtocol.getProtocol(client);
            //2. 处理客户端的请求
            //进入过滤器
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 获取
     * @return client
     */
    public Socket getClient() {
        return client;
    }

    /**
     * 设置
     * @param client
     */
    public void setClient(Socket client) {
        this.client = client;
    }

    /**
     * 获取
     * @return maxInput
     */
    public int getMaxInput() {
        return maxInput;
    }

    /**
     * 设置
     * @param maxInput
     */
    public void setMaxInput(int maxInput) {
        this.maxInput = maxInput;
    }

    public String toString() {
        return "ChatServerHandler{client = " + client + ", maxInput = " + maxInput + "}";
    }
}
