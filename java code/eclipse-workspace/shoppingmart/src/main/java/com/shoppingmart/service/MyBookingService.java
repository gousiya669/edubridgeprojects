package com.shoppingmart.service;

import java.util.List;


import com.shoppingmart.entities.MyBooking;



public interface MyBookingService {
public MyBooking saveMyBooking(MyBooking mybooking);
	
	public List<MyBooking> getAllMyBookings();
	
	public MyBooking getMyBookingById(int bkgid);
	
	public void deleteMyBookingById(int bkgid);
	
	public MyBooking updateMyBooking(int bkgid , MyBooking mybooking);

}
