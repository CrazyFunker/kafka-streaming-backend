package com.tinkerworld.kafka;

import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-27T13:35:26+0000",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class TinkerMessageMapperImpl implements TinkerMessageMapper {

    @Override
    public TinkerMessageDTO tinkerMessageToTinkerMessageDto(TinkerMessage tinkerMessage) {
        if ( tinkerMessage == null ) {
            return null;
        }

        TinkerMessageDTO tinkerMessageDTO = new TinkerMessageDTO();

        if ( tinkerMessage.getTinkerMessageType() != null ) {
            tinkerMessageDTO.setTinkerMessageType( tinkerMessage.getTinkerMessageType().name() );
        }
        tinkerMessageDTO.setMessage( tinkerMessage.getMessage() );

        return tinkerMessageDTO;
    }
}
