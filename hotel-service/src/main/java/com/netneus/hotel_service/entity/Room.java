package com.netneus.hotel_service.entity;

import java.util.List;

import lombok.experimental.SuperBuilder;
@SuperBuilder
public class Room extends BaseModel{
    private double basePrice;
    private List<Facility> facilities;
    private boolean isActive;
    private RoomType roomType;
    private int numOfBeds;
    private BookingStatus bookingStatus; 
}
