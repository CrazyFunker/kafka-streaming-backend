package com.tinkerworld.kafka;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TinkerMessageDTO {
    private String message;
    private String tinkerMessageType;
}
