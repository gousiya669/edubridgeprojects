package com.shoppingmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.shoppingmart.entities.MyBooking;
import com.shoppingmart.exceptions.InvalidInputException;
import com.shoppingmart.service.MyBookingService;



@RestController
public class MyBookingController {

	@Autowired
	MyBookingService mybookingservice;
	
	
	 /*
	  * TODO: add myorders
	  */
	@PostMapping("/booking/add")
	public MyBooking saveMyBooking(@RequestBody MyBooking mybooking) {
		return mybookingservice.saveMyBooking(mybooking);
	}
	
	 /*
	  * TODO: get all my orders
	  */
	@GetMapping("/booking/allbookings")
	public List<MyBooking> getAllMyBooking(){
		return mybookingservice.getAllMyBookings();
	}
	
	 /*
	  * TODO: Get the order by id
	  */
	
	@GetMapping("/booking/{bkgid}")
	public ResponseEntity<MyBooking> getMyBookingById(@PathVariable int bkgid) {
		System.out.println(bkgid);
		if(bkgid <=0) {
			throw new InvalidInputException(bkgid+" not a valid booking ID");
		}
		MyBooking mybooking= mybookingservice.getMyBookingById(bkgid);
		return new ResponseEntity<MyBooking>(mybooking ,HttpStatus.OK);
		
	}

	
	 /*
	  * TODO: delete booking by id
	  */
	
	
	@DeleteMapping("/booking/{bkgid}")
	public String deleteDepartmentById(@PathVariable int bkgid) {
		mybookingservice.deleteMyBookingById(bkgid);
		return "your booking is  deleted";
	}
	
	
	 /*
	  * TODO: updating booking by id
	  */
	@PutMapping("/booking/{id}")
	public ResponseEntity<MyBooking> updateMyBooking(@PathVariable(value = "id") int bkgid,
			@RequestBody MyBooking mybooking){
		MyBooking updateMyBooking = mybookingservice.updateMyBooking(bkgid, mybooking);
		return new ResponseEntity<MyBooking>(updateMyBooking,HttpStatus.OK);
		
	
}
}
