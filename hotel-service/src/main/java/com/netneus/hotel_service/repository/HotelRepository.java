package com.netneus.hotel_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netneus.hotel_service.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
