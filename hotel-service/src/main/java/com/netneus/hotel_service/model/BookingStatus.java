package com.netneus.hotel_service.model;

public enum BookingStatus {
    BOOKED,               // The room is reserved.
    CANCELLED,            // The booking has been cancelled.
    PAYMENT_PENDING,      // Payment has not been made yet.
    ON_HOLD,              // The booking is temporarily on hold (e.g., awaiting payment or guest confirmation).
    AVAILABLE,            // The room is available for booking.
    CHECKED_IN,           // The guest has checked in.
    CHECKED_OUT,          // The guest has checked out.
    NO_SHOW,              // The guest did not show up (no-show).
    REFUNDED,             // The booking has been refunded.
    PENDING_CONFIRMATION, // The booking is awaiting confirmation from the hotel or guest.
    OVERBOOKED,           // The hotel has overbooked beyond the available rooms.
    UNDER_PAYMENT,        // Payment received is insufficient or incomplete.
    AWAITING_PAYMENT,     // Payment is expected but has not yet been processed.
    COMPLETED,            // The booking is complete, including any post-stay actions (e.g., feedback or invoices).
}