package trix2.web;

import trix2.dtos.MessageDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by misael on 29/10/2015.
 */
@Controller
public class WebSocket {

    @MessageMapping("/pipe")
	@SendTo("/topic/pipe")
    public MessageDTO pipe(MessageDTO message) throws Exception {

        return new MessageDTO("Hello, " + message.header + "!");
    }
}
