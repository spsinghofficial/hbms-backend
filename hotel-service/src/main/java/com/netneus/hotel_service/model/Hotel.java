package com.netneus.hotel_service.model;

import lombok.*;

@Data
@Builder
@EqualsAndHashCode(callSuper=true)
public class Hotel extends BaseModel{
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean isActive;

}