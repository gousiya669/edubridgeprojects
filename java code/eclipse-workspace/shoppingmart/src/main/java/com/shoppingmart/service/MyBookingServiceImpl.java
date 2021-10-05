package com.shoppingmart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingmart.entities.MyBooking;
import com.shoppingmart.exceptions.RecordNotFoundException;
import com.shoppingmart.repository.MyBookingRepository;


@Service
public class MyBookingServiceImpl implements MyBookingService {
	@Autowired
	MyBookingRepository mybookingrepo;
	@Override
	public MyBooking saveMyBooking(MyBooking mybooking) {
		// TODO Auto-generated method stub
		return mybookingrepo.save(mybooking);
	}

	@Override
	public List<MyBooking> getAllMyBookings() {
		// TODO Auto-generated method stub
		return mybookingrepo.findAll();
	}

	@Override
	public MyBooking getMyBookingById(int bkgid) {
		// TODO Auto-generated method stub
		
		
		
		return mybookingrepo.findById(bkgid)
				.orElseThrow(() -> new RecordNotFoundException("Booking with ID"+bkgid+" not found"));
		
	}

	@Override
	public void deleteMyBookingById(int bkgid) {
		// TODO Auto-generated method stub
		mybookingrepo.deleteById(bkgid);
		
	}

	
	
	
	@Override
	public MyBooking updateMyBooking(int bkgid, MyBooking mybooking) {
		// TODO Auto-generated method stub
		MyBooking b1 = getMyBookingById(bkgid);
		b1.setProductname(mybooking.getProductname());
		b1.setMobilenumber(mybooking.getMobilenumber());
		b1.setAddress(mybooking.getAddress());
		b1.setAmmount(mybooking.getAmmount());
		b1.setShippingprogess(mybooking.getShippingprogess());
		
		return mybookingrepo.save(b1);
	}
	
	
	
	
	
	
	
	
	

}
