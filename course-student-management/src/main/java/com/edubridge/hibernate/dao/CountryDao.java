package com.edubridge.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.edubridge.hibernate.entities.Country;

public class CountryDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sheeba");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public List<Country> getAllCountries(){
		EntityManager entityManager = getEntityManager();
		List<Country> countryList = entityManager.createQuery("from Country",Country.class).getResultList();
		entityManager.close();
		return countryList;
	}
public void saveCountry(Country country) {
	EntityManager entityManager = getEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(country);
	entityTransaction.commit();
	entityManager.close();
}
public void updateCountry(Country country) {
	EntityManager entityManager = getEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	Country c1 = entityManager.find(Country.class, country.getCountryId());
	c1.setCountryCode(country.getCountryCode());
	c1.setCountryName(country.getCountryName());
	
	entityTransaction.commit();
	entityManager.close();
}
public void deleteCountry(Country country) {
	EntityManager entityManager = getEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	Country c1 = entityManager.find(Country.class, country.getCountryId());
	entityManager.remove(c1);
	
	entityTransaction.commit();
	entityManager.close();
}
}
