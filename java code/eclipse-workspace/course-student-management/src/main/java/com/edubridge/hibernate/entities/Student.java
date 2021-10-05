package com.edubridge.hibernate.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@NamedQueries({
	@NamedQuery(name = "findAllStudentByMarks",
				query = "select s from Student s where s.marks = :marks"),
	@NamedQuery (name = "findAllStudentByCourse",
				query = "select s from Student s where s.course.courseName = :courseName")
})
public class Student {
	
	@Id
	@Column(name = "student_id")
	private int studentId;
	
	@Column (name = "student_name")
	private String studentName;
	
	private double marks;
	
	//@Column(name = "course_id")
	//private String courseId;
	@OneToOne
	@JoinColumn(name="course_id")
	private Course course;
	
	@Column(name = "dob")
	private Date dateOfBirth;
	
	public Student() {}

	public Student(int studentId, String studentName, double marks, Course course, Date dateOfBirth) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.course = course;
		this.dateOfBirth = dateOfBirth;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		long temp;
		temp = Double.doubleToLongBits(marks);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
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
		Student other = (Student) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (Double.doubleToLongBits(marks) != Double.doubleToLongBits(other.marks))
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", course="
				+ course + ", dateOfBirth=" + dateOfBirth + "]";
	}

}