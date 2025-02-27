package com.netneus.hotel_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HotelController {
    @GetMapping("/about")
    public String about() {
        return "Hotel Service to manage hotel operations like manage hotels, manage rooms, manage facilities etc";
    }
}

