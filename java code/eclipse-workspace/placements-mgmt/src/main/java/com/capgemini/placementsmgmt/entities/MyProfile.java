package com.capgemini.placementsmgmt.entities;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "myprofile")
public class MyProfile {
	@Id
	@Column(name = "registrationid")
	private int RegistrationId;
	@Column(name = "fullname")
	private String FullName;
	@Column(name = "emailid")
	private String EmailId;
	@Column(name = "phnumber")
	private long PhNumber;
	@Column(name = "dob")
	private Date dob;
	@Column(name = "gender")
	private String Gender;
	//password
	@Column(name = "address")
	private String Address;
	@Column(name = "qualification")
	private String Qualification;
	@Column(name = "specialization")
	private String Specialization;
	@Column(name = "cgpa")
	private Double cgpa;
	@Column(name = "course")
	private String course;
	@Column(name = "workexperience")
	private String WorkExperience;
	@Column(name = "hobbies")
	private String Hobbies;
public MyProfile() {}
public int getRegistrationId() {
	return RegistrationId;
}
public void setRegistrationId(int registrationId) {
	RegistrationId = registrationId;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getEmailId() {
	return EmailId;
}
public void setEmailId(String emailId) {
	EmailId = emailId;
}
public long getPhNumber() {
	return PhNumber;
}
public void setPhNumber(long phNumber) {
	PhNumber = phNumber;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
public String getSpecialization() {
	return Specialization;
}
public void setSpecialization(String specialization) {
	Specialization = specialization;
}
public Double getCgpa() {
	return cgpa;
}
public void setCgpa(Double cgpa) {
	this.cgpa = cgpa;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getWorkExperience() {
	return WorkExperience;
}
public void setWorkExperience(String workExperience) {
	WorkExperience = workExperience;
}
public String getHobbies() {
	return Hobbies;
}
public void setHobbies(String hobbies) {
	Hobbies = hobbies;
}
@Override
public int hashCode() {
	return Objects.hash(Address, EmailId, FullName, Gender, Hobbies, PhNumber, Qualification, RegistrationId,
			Specialization, WorkExperience, cgpa, course, dob);
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
	return Objects.equals(Address, other.Address) && Objects.equals(EmailId, other.EmailId)
			&& Objects.equals(FullName, other.FullName) && Objects.equals(Gender, other.Gender)
			&& Objects.equals(Hobbies, other.Hobbies) && PhNumber == other.PhNumber
			&& Objects.equals(Qualification, other.Qualification) && RegistrationId == other.RegistrationId
			&& Objects.equals(Specialization, other.Specialization)
			&& Objects.equals(WorkExperience, other.WorkExperience) && Objects.equals(cgpa, other.cgpa)
			&& Objects.equals(course, other.course) && Objects.equals(dob, other.dob);
}
@Override
public String toString() {
	return "MyProfile [RegistrationId=" + RegistrationId + ", FullName=" + FullName + ", EmailId=" + EmailId
			+ ", PhNumber=" + PhNumber + ", dob=" + dob + ", Gender=" + Gender + ", Address=" + Address
			+ ", Qualification=" + Qualification + ", Specialization=" + Specialization + ", cgpa=" + cgpa + ", course="
			+ course + ", WorkExperience=" + WorkExperience + ", Hobbies=" + Hobbies + "]";
}

	
	
	

}
