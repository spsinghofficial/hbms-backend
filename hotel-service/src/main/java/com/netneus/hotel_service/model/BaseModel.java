package com.netneus.hotel_service.model;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BaseModel {
    private int id;
    private String name;
    private String description;
    private String createdBy;
    private String ModifiedBy;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;


}
