package com.netneus.hotel_service.services;

import com.netneus.hotel_service.exception.HotelNotFoundException;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import com.netneus.hotel_service.entity.Hotel;
import com.netneus.hotel_service.repository.HotelRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelService implements IHotelService {

    private final HotelRepository repository;

    public Hotel createHotel(Hotel hotel) {
        return repository.save(hotel);
    }

    // Read (all hotels)
    public List<Hotel> getAllHotels() {
        return repository.findAll(); // Return a copy to prevent external modification
    }

    // Read (by ID)
    public Optional<Hotel> getHotelById(Long id) {
        return repository.findById(id);
    }

    // Update
    public Hotel updateHotel(Long id, Hotel updatedHotel) {
        repository.findById(id).orElseThrow(()-> {throw new HotelNotFoundException("Hotel not found ");});
       updatedHotel.setId(id);
       return repository.save(updatedHotel);
    }

    // Delete
    public void deleteHotel(Long id) {
         repository.deleteById(id);
    }
}
