package com.edubridge.hibernate.main;

import java.util.List;

import com.edubridge.hibernate.dao.CountryDao;
import com.edubridge.hibernate.entities.Country;

public class CountryMain {

	public static void main(String[] args) {
		
		Country country = new Country();
		country.setCountryId(6);
		//country.setCountryCode("USA");
		//country.setCountryName("United States");
		
		
	CountryDao countryDao = new CountryDao();
	//countryDao.saveCountry(country);
	//countryDao.updateCountry(country);
	countryDao.deleteCountry(country);
	List<Country> countryList = countryDao.getAllCountries();
	countryList.forEach(c ->
	System.out.println(c.getCountryId()+" "+c.getCountryCode()+" "+c.getCountryName())
	);

	}

}
