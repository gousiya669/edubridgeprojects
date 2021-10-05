package com.shoppingmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "mybooking")
public class MyBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column (name = "bkg_id")
	private int bkgid;
	
	@Column (name = "product_name")
	private String productname;
	
	@Column (name = "mobile_number")
	private int mobilenumber;
	
	@Column (name = "bkg_address")
	private String address;
	
	@Column (name = "bkg_ammount")
	private int ammount;
	
	@Column (name = "shipping_progess")
	private String shippingprogess;
	public int getBkgid() {
		return bkgid;
	}
	public void setBkgid(int bkgid) {
		this.bkgid = bkgid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public String getShippingprogess() {
		return shippingprogess;
	}
	public void setShippingprogess(String shippingprogess) {
		this.shippingprogess = shippingprogess;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ammount;
		result = prime * result + bkgid;
		result = prime * result + mobilenumber;
		result = prime * result + ((productname == null) ? 0 : productname.hashCode());
		result = prime * result + ((shippingprogess == null) ? 0 : shippingprogess.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyBooking other = (MyBooking) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (ammount != other.ammount)
			return false;
		if (bkgid != other.bkgid)
			return false;
		if (mobilenumber != other.mobilenumber)
			return false;
		if (productname == null) {
			if (other.productname != null)
				return false;
		} else if (!productname.equals(other.productname))
			return false;
		if (shippingprogess == null) {
			if (other.shippingprogess != null)
				return false;
		} else if (!shippingprogess.equals(other.shippingprogess))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MyBookings [bkgid=" + bkgid + ", productname=" + productname + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + ", ammount=" + ammount + ", shippingprogess=" + shippingprogess + "]";
	}
	
	
	
}
