package com.ws.RestAPI.messageService;

import com.ws.RestAPI.Model.Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MessageService {

  public List<Message> getMessages(){
        Message message  = new Message(1, "Bible", "Holy Sprite");
        Message message2 = new Message(2, "MyHistory", "Meelianah");
        Message message3 = new Message(3, "Bible", "Holy Sprite");
        Message message4 = new Message(4, "MyHistory", "Meelianah");
        Message message5 = new Message(5, "Bible", "Holy Sprite");
        Message message6 = new Message(6, "MyHistory", "Meelianah");
        List<Message> listo = new ArrayList<Message>();
        listo.add(message);
        listo.add(message2);
        listo.add(message3);
        listo.add(message4);
        listo.add(message5);
        listo.add(message6);
        return listo;
    }
    public Map<Long, Message> getMessagesID(long id ){
        Message messaging = new Message();
        Message message = new Message(1, "Bible", "Holy Spirit");
        Message message2 = new Message(2, "MyHistory", "Meelianah");
        Message message3 = new Message(3, "Bible", "Holy Spirit");
        Map<Long, Message> mappin = new HashMap();

        messaging.setId(mappin.size() + 1);
        mappin.put(messaging.getId(), message);
        messaging.setId(mappin.size() + 1);
        mappin.put(messaging.getId(), message2);
        messaging.setId(mappin.size() + 1);
        mappin.put(messaging.getId(), message3);

        return mappin;
    }
}
