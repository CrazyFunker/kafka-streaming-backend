package com.tinkerworld.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TinkerMessagesController {

    @Autowired
    private TinkerMessageService tinkerMessageService;

    @GetMapping(path = "/message")
    public TinkerMessageDTO getMessage() {
        return TinkerMessageMapper
                .INSTANCE
                .tinkerMessageToTinkerMessageDto(tinkerMessageService.getTinkerMessage());
    }
}
