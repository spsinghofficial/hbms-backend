package com.netneus.hotel_service.controllers;

import com.netneus.hotel_service.entity.Hotel;
import com.netneus.hotel_service.services.HotelService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@Tag(name = "Hotel Management", description = "Hotel Management API")
public class HotelController {
    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    // Create a hotel
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        final Hotel createdHotel = hotelService.createHotel(hotel);
        return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
    }

    // Get all hotels
    @GetMapping
    @Operation(summary = "Get list of all hotels", description = "Fetch all hotels managed by given user",
     responses = {
            @ApiResponse(responseCode = "200", description = "Hotels fetched successfully"),
            @ApiResponse(responseCode = "401", description = "User is unauthorized")
        })
    public ResponseEntity<List<Hotel>> getAllHotels() {
        final List<Hotel> hotels = hotelService.getAllHotels();
        return new ResponseEntity<>(hotels, HttpStatus.OK);
    }

    // Get a hotel by ID
    @GetMapping("/{id}")
    @Operation(summary = "Get hotel by ID", description = "Fetch a hotel using its ID")
    public ResponseEntity<Hotel> getHotelById(@PathVariable Long id) {
        return hotelService.getHotelById(id)
                .map(hotel -> new ResponseEntity<>(hotel, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    // Update a hotel
    @PutMapping("/{id}")
    public ResponseEntity<Hotel> updateHotel(@PathVariable Long id, @RequestBody Hotel hotel) {
        return new ResponseEntity<>(hotelService.updateHotel(id, hotel), HttpStatus.OK);
                
    }

    // Delete a hotel
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable Long id) {
        hotelService.deleteHotel(id);
        return ResponseEntity.ok().build();
    }
}

