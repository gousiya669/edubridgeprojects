package com.edubridge.springboot.placementmanagement.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_attendance")
public class StudentAttendance {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stud_id")
	private int studId;
	
	@Column(name="stud_name")
	private String studName;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="mark_register")
	private String markRegister;
	
	@Column(name="total_days")
	private int totalDays;
	
	@Column(name="no_of_days_present")
	private int noOfDaysPresent;
	
	@Column(name="no_of_days_absent")
	private int noOfDaysAbsent;
	
	@Column(name="total_perc")
	private int totalPerc;
	
	public void StudentAttendance() {}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getMarkRegister() {
		return markRegister;
	}

	public void setMarkRegister(String markRegister) {
		this.markRegister = markRegister;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}

	public int getNoOfDaysPresent() {
		return noOfDaysPresent;
	}

	public void setNoOfDaysPresent(int noOfDaysPresent) {
		this.noOfDaysPresent = noOfDaysPresent;
	}

	public int getNoOfDaysAbsent() {
		return noOfDaysAbsent;
	}

	public void setNoOfDaysAbsent(int noOfDaysAbsent) {
		this.noOfDaysAbsent = noOfDaysAbsent;
	}

	public int getTotalPerc() {
		return totalPerc;
	}

	public void setTotalPerc(int totalPerc) {
		this.totalPerc = totalPerc;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseName, markRegister, noOfDaysAbsent, noOfDaysPresent, studId, studName, totalDays,
				totalPerc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentAttendance other = (StudentAttendance) obj;
		return Objects.equals(courseName, other.courseName) && Objects.equals(markRegister, other.markRegister)
				&& noOfDaysAbsent == other.noOfDaysAbsent && noOfDaysPresent == other.noOfDaysPresent
				&& studId == other.studId && Objects.equals(studName, other.studName) && totalDays == other.totalDays
				&& totalPerc == other.totalPerc;
	}

	@Override
	public String toString() {
		return "StudentAttendance [studId=" + studId + ", studName=" + studName + ", courseName=" + courseName
				+ ", markRegister=" + markRegister + ", totalDays=" + totalDays + ", noOfDaysPresent=" + noOfDaysPresent
				+ ", noOfDaysAbsent=" + noOfDaysAbsent + ", totalPerc=" + totalPerc + "]";
	}
	
	
}
