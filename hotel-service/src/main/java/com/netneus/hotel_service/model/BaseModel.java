package com.netneus.hotel_service.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
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
