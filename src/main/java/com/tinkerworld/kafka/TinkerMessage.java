package com.tinkerworld.kafka;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TinkerMessage {
    private String message;
    private TinkerMessageType tinkerMessageType;
}
