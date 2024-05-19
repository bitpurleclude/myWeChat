package com.purplecloud.protocol;

import com.purplecloud.bean.ProtocolType;
import com.purplecloud.imp.Data;

import java.io.Serializable;

public class MyProtocol {
    private Data data;
    private ProtocolType protocolType;

    public MyProtocol() {
    }

    public MyProtocol(Data data, ProtocolType protocolType) {
        this.data = data;
        this.protocolType = protocolType;
    }

    /**
     * 获取
     * @return data
     */
    public Data getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 获取
     * @return protocolType
     */
    public ProtocolType getProtocolType() {
        return protocolType;
    }

    /**
     * 设置
     * @param protocolType
     */
    public void setProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType;
    }

    public String toString() {
        return "MyProtocol{data = " + data + ", protocolType = " + protocolType + "}";
    }
}
