package com.shoppingmart.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "myprofile")
public class MyProfile {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column (name = "regid")
	private int regid;
	
	@Column (name = "firstname")
	private String firstname;
	
	@Column (name = "lastname")
	private String lastname;
	
	@Column (name = "email")
	private String email;
	
	@Column (name = "mobilenumbers")
	private long mobilenumbers;
	
	@Column (name = "gender")
	private String gender;
	
	
	@Column (name = "address")
	private String address;
	
	@Column (name = "postalcode")
	private long postalcode;

	public int getRegid() {
		return regid;
	}

	public void setRegid(int regid) {
		this.regid = regid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobilenumbers() {
		return mobilenumbers;
	}

	public void setMobilenumbers(long mobilenumbers) {
		this.mobilenumbers = mobilenumbers;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(long postalcode) {
		this.postalcode = postalcode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + (int) (mobilenumbers ^ (mobilenumbers >>> 32));
		result = prime * result + (int) (postalcode ^ (postalcode >>> 32));
		result = prime * result + regid;
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
		MyProfile other = (MyProfile) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (mobilenumbers != other.mobilenumbers)
			return false;
		if (postalcode != other.postalcode)
			return false;
		if (regid != other.regid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyProfile [regid=" + regid + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", mobilenumbers=" + mobilenumbers + ", gender=" + gender + ", address=" + address + ", postalcode="
				+ postalcode + "]";
	}

	

	
}
