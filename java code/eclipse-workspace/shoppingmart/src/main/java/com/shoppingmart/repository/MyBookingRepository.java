package com.shoppingmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingmart.entities.MyBooking;

@Repository
public interface MyBookingRepository extends JpaRepository< MyBooking, Integer> {

}

