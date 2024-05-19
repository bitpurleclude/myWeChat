package com.purplecloud.filter;

import com.purplecloud.bean.Message;

public class MessageFilter {
    public static void doFilter(Message message){
        switch (message.getMessageReceiveType()) {
            case GROUP:
                break;
            case USER:
                break;
            default:
                break;
        }
    }
}
