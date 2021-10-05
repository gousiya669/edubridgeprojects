package com.edubridge.hibernate.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table


public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
 private int countryId;
	@Column(name = "country_code", nullable = false, unique = true)
 private String countryCode;
	@Column(name = "country_name", nullable = false, unique = true)	
 private String countryName;
public int getCountryId() {
	return countryId;
}
public void setCountryId(int countryId) {
	this.countryId = countryId;
}
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
@Override
public int hashCode() {
	return Objects.hash(countryCode, countryId, countryName);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Country other = (Country) obj;
	return Objects.equals(countryCode, other.countryCode) && countryId == other.countryId
			&& Objects.equals(countryName, other.countryName);
}
@Override
public String toString() {
	return "Country [countryId=" + countryId + ", countryCode=" + countryCode + ", countryName=" + countryName + "]";
}
 
}
