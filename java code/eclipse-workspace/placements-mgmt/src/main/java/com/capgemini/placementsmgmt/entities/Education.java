package com.capgemini.placementsmgmt.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="education2")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int id;
	@Column(name = "specialization_name")
	private String Specialization;
	@Column(name = "university_name")
	private String University;
	@Column(name = "cgpa")
	private double cgpa;
	@Column(name = "passingyear")
	private String passingyear;
	public Education() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getUniversity() {
		return University;
	}
	public void setUniversity(String university) {
		University = university;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public String getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(String passingyear) {
		this.passingyear = passingyear;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Specialization, University, cgpa, id, passingyear);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Education other = (Education) obj;
		return Objects.equals(Specialization, other.Specialization) && Objects.equals(University, other.University)
				&& Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && id == other.id
				&& Objects.equals(passingyear, other.passingyear);
	}
	@Override
	public String toString() {
		return "Education [id=" + id + ", Specialization=" + Specialization + ", University=" + University + ", cgpa="
				+ cgpa + ", passingyear=" + passingyear + "]";
	}
	
}
