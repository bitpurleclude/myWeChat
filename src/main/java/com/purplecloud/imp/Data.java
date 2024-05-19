package com.purplecloud.imp;

import com.alibaba.fastjson.annotation.JSONType;
import com.purplecloud.bean.Message;

@JSONType(seeAlso = {Message.class})
public interface Data {
}
