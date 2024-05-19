package com.purplecloud.filter;

import com.purplecloud.bean.Message;
import com.purplecloud.protocol.MyProtocol;

public class ProtocolFilter {
    public static void doFilter(MyProtocol myProtocol){
        switch (myProtocol.getProtocolType()){
            case Message:
                MessageReceiveFilter.doFilter((Message) myProtocol.getData());
                break;
            default:
                break;
        }
    }
}
