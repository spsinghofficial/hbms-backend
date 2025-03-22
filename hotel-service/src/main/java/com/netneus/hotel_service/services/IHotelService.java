package com.netneus.hotel_service.services;

import java.util.List;
import java.util.Optional;

import com.netneus.hotel_service.entity.Hotel;

public interface IHotelService {
    Hotel createHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Optional<Hotel> getHotelById(Long id);
    Hotel updateHotel(Long id, Hotel updatedHotel);
    void deleteHotel(Long id);
}
