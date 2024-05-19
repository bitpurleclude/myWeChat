package com.purplecloud.bean;

import com.alibaba.fastjson.annotation.JSONType;
import com.purplecloud.imp.Data;

@JSONType(typeName = "Message")
public class Message implements Data {
    private String message;
    private int sendUserId;
    private int receiveId;
    private MessageType messageType;
    private MessageReceiveType messageReceiveType;

    public Message() {
    }

    public Message(String message, int sendUserId, int receiveId, MessageType messageType, MessageReceiveType messageReceiveType) {
        this.message = message;
        this.sendUserId = sendUserId;
        this.receiveId = receiveId;
        this.messageType = messageType;
        this.messageReceiveType = messageReceiveType;
    }

    /**
     * 获取
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取
     * @return sendUserId
     */
    public int getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置
     * @param sendUserId
     */
    public void setSendUserId(int sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取
     * @return receiveId
     */
    public int getReceiveId() {
        return receiveId;
    }

    /**
     * 设置
     * @param receiveId
     */
    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    /**
     * 获取
     * @return messageType
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * 设置
     * @param messageType
     */
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    /**
     * 获取
     * @return messageReceiveType
     */
    public MessageReceiveType getMessageReceiveType() {
        return messageReceiveType;
    }

    /**
     * 设置
     * @param messageReceiveType
     */
    public void setMessageReceiveType(MessageReceiveType messageReceiveType) {
        this.messageReceiveType = messageReceiveType;
    }

    public String toString() {
        return "Message{message = " + message + ", sendUserId = " + sendUserId + ", receiveId = " + receiveId + ", messageType = " + messageType + ", messageReceiveType = " + messageReceiveType + "}";
    }
}
