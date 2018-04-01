package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author bo.zhou
 * @date 2018/4/1
 */
@Component
public class MessagePrinter {

    final private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service){
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }

}
