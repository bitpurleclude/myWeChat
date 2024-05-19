import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.purplecloud.bean.Message;
import com.purplecloud.bean.MessageReceiveType;
import com.purplecloud.bean.MessageType;
import com.purplecloud.bean.ProtocolType;
import com.purplecloud.protocol.MyProtocol;
import com.purplecloud.util.GetProtocol;
import org.junit.Test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerTest {
    @Test
    public void test() throws IOException {
        Socket client = new Socket("localhost", 8080);
        MyProtocol protocol = new MyProtocol();
        Message message = new Message();
        message.setMessage("From 3122004951 李嘉锐： what time is it");
        message.setMessageType(MessageType.TEXT);
        message.setSendUserId(1);
        message.setReceiveId(2);
        message.setMessageReceiveType(MessageReceiveType.USER);
        protocol.setProtocolType(ProtocolType.Message);
        protocol.setData(message);
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        System.out.println(JSON.toJSONString(protocol,SerializerFeature.WriteClassName));
        out.writeUTF(JSON.toJSONString(protocol, SerializerFeature.WriteClassName));
        out.close();
        client.close();
    }
}
