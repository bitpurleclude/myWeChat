package com.purplecloud.filter;

import com.purplecloud.bean.Message;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageReceiveFilter {
    @Autowired
    private RedissonClient redissonClient;
    public static void doFilter(Message message) {
        switch (message.getMessageReceiveType()) {
            case GROUP:
                System.out.println("MessageFilter doFilter");
                break;
            case USER:
                System.out.println("MessageFilter doFilter");
                break;
            default:
                break;
        }
        System.out.println("MessageFilter doFilter");
    }
}
