package com.netneus.hotel_service.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder 
@EqualsAndHashCode(callSuper=true)
@Table
@Entity
public class Hotel extends BaseModel{
    @Schema(description = "Hotel address", example = "123 Main St", required = true)
    private String address;

    @Schema(description = "City where the hotel is located", example = "Toronto", required = true)
    private String city;

    @Schema(description = "State or          province", example = "Ontario")
    private String state;

    @Schema(description = "Postal or ZIP code", example = "M5A 1A1", required = true)
    private String zip;

    @Schema(description = "Indicates if the hotel is active", example = "true")
    private boolean isActive;

}