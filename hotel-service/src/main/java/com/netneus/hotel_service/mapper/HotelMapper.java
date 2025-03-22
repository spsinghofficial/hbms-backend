package com.netneus.hotel_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.netneus.hotel_service.dto.HotelDto;
import com.netneus.hotel_service.entity.Hotel;

@Mapper
public interface HotelMapper {
    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);

    HotelDto mapToHotelDto(Hotel hotel);

    Hotel mapToHotel(HotelDto hotelDto);
}
