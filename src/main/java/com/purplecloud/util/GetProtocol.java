package com.purplecloud.util;

import com.alibaba.fastjson2.JSON;
import com.purplecloud.protocol.MyProtocol;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class GetProtocol {
    public static MyProtocol getProtocol(Socket client) throws IOException {
        //获取输入流
        DataInputStream in = new DataInputStream(client.getInputStream());
        String jsonStr = in.readUTF();
        // 使用Fastjson将JSON字符串转换为Message对象
        System.out.println("获取到客户端消息: " + jsonStr);
        return JSON.parseObject(jsonStr, MyProtocol.class);
    }
}
