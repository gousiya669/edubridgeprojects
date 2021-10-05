package com.capgemini.placementsmgmt.entities;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity 
@Table(name = "applyjobs")
public class ApplyJobs {
	@Id 
	@Column(name = "registrstion_id")
	private int RegistrationId;
	@OneToMany(fetch = FetchType.EAGER)
	@JoinTable(name= "applyjobs_company",joinColumns=@JoinColumn(name= "registration_id"),
	inverseJoinColumns = @JoinColumn(name="company_name"))
	private Set<Company> company;
	@Column(name = "status")
	private String Status;
	public ApplyJobs() {}
	public int getRegistrationId() {
		return RegistrationId;
	}
	public void setRegistrationId(int registrationId) {
		RegistrationId = registrationId;
	}
	public Set<Company> getCompany() {
		return company;
	}
	public void setCompany(Set<Company> company) {
		this.company = company;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(RegistrationId, Status, company);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ApplyJobs other = (ApplyJobs) obj;
		return RegistrationId == other.RegistrationId && Objects.equals(Status, other.Status)
				&& Objects.equals(company, other.company);
	}
	@Override
	public String toString() {
		return "ApplyJobs [RegistrationId=" + RegistrationId + ", company=" + company + ", Status=" + Status + "]";
	}
	
	

}
//@ManyToMany(fetch = FetchType.EAGER)
//@JoinTable(name="students_course",joinColumns=@JoinColumn(name="student_id"),
//inverseJoinColumns=@JoinColumn(name="course_id"))//@JoinTable is used to map join table in database
