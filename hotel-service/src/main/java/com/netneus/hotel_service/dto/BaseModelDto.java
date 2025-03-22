package com.netneus.hotel_service.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@RequiredArgsConstructor
public class BaseModelDto {
    private Long id;
    private String name;
    private String description;
}
