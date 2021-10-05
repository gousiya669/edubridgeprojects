package com.capgemini.placementsmgmt.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table (name = "company")


public class Company {
	@Id 
	@Column(name = "company_name")
	private String Company;
	public Company() {}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Company);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		return Objects.equals(Company, other.Company);
	}
	@Override
	public String toString() {
		return "Company [Company=" + Company + "]";
	}
	
	

}
