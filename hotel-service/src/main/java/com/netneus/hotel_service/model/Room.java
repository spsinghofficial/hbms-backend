package com.netneus.hotel_service.model;

import java.util.List;

public class Room extends BaseModel{
    private double basePrice;
    private List<Facility> facilities;
    private boolean isActive;
    private RoomType roomType;
    private int numOfBeds;
    private BookingStatus bookingStatus; 
}
