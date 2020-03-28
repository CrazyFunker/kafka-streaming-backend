package com.tinkerworld.kafka;

import org.springframework.stereotype.Service;

@Service
public class TinkerMessageService {
    public TinkerMessage getTinkerMessage() {
        return TinkerMessage.builder().message("hello world")
                .tinkerMessageType(TinkerMessageType.INFO)
                .build();
    }
}
