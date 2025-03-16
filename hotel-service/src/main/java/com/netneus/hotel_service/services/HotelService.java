package com.netneus.hotel_service.services;

import com.netneus.hotel_service.model.Hotel;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    private final List<Hotel> hotels = new ArrayList<>();
    private int nextId = 1; // Simple ID generator
    @PostConstruct
    public void init() {
        // Add default hotels
        
        hotels.add(Hotel.builder()
                .id(nextId++)
                .name("Grand Hotel")
                .address("123 Main St")
                .city("Springfield")
                .state("IL")
                .zip("62701")
                .build());

        hotels.add(Hotel.builder()
                .id(nextId++)
                .name("Ocean View Resort")
                .address("456 Beach Rd")
                .city("Miami")
                .state("FL")
                .zip("33101")
                .build());

        hotels.add(Hotel.builder()
                .id(nextId++)
                .name("Mountain Lodge")
                .address("789 Pine Ln")
                .city("Denver")
                .state("CO")
                .zip("80201")
                .build());
    }
    // Create
    public Hotel createHotel(Hotel hotel) {
        Hotel newHotel = Hotel.builder()
                .id(nextId++)
                .name(hotel.getName())
                .address(hotel.getAddress())
                .city(hotel.getCity())
                .state(hotel.getState())
                .zip(hotel.getZip())
                .build();
        hotels.add(newHotel);
        return newHotel;
    }

    // Read (all hotels)
    public List<Hotel> getAllHotels() {
        return new ArrayList<>(hotels); // Return a copy to prevent external modification
    }

    // Read (by ID)
    public Optional<Hotel> getHotelById(int id) {
        return hotels.stream()
                .filter(hotel -> hotel.getId() == id)
                .findFirst();
    }

    // Update
    public Optional<Hotel> updateHotel(int id, Hotel updatedHotel) {
        Optional<Hotel> existingHotel = getHotelById(id);
        if (existingHotel.isPresent()) {
            Hotel hotel = existingHotel.get();
            hotel.setName(updatedHotel.getName());
            hotel.setAddress(updatedHotel.getAddress());
            hotel.setCity(updatedHotel.getCity());
            hotel.setState(updatedHotel.getState());
            hotel.setZip(updatedHotel.getZip());
            return Optional.of(hotel);
        }
        return Optional.empty();
    }

    // Delete
    public boolean deleteHotel(int id) {
        return hotels.removeIf(hotel -> hotel.getId() == id);
    }
}
