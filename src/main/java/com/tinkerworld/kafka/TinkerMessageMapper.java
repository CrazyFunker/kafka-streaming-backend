package com.tinkerworld.kafka;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TinkerMessageMapper {
    TinkerMessageMapper INSTANCE = Mappers.getMapper(TinkerMessageMapper.class);

    @Mapping(source = "tinkerMessageType", target = "tinkerMessageType")
    TinkerMessageDTO tinkerMessageToTinkerMessageDto(TinkerMessage tinkerMessage);

//    @Mapping(source = "message", target = "asdf")
//    TinkerMessageDTO tinkerMessageToTinkerMessageDto(TinkerMessage tinkerMessage) {
//        return TinkerMessageDTO.builder()
//                .message(tinkerMessage.getMessage())
//                .tinkerMessageType(tinkerMessage.getTinkerMessageType().name())
//                .build();
//    }
}
