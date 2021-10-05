
package com.edubridge.hibernate.entities;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
@NamedQueries({
@NamedQuery(name = "findAllStudentByMarks",
            query = "select s from Student s where s.marks = :marks"),
//@NamedQuery(name = "findAllStudentByCourse",
           // query = "select s from Student s where s.course.courseName = :courseName"),
@NamedQuery(name ="findAllStudentByNameS",
query = "select s from Student s where s.studentName like:startsWith "

)

})

public class Student {
	
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	private double marks;
	
	//@Column(name="course_id")
	//private String courseId;
	//@OneToOne
	//@JoinColumn(name="course_id")
	//private Course course;
	
	//@OneToMany
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="students_course",joinColumns=@JoinColumn(name="student_id"),
	inverseJoinColumns=@JoinColumn(name="course_id"))//@JoinTable is used to map join table in database
	private Set<Course> course;
	@Column(name="dob")
	private Date dateOfBirth;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private Address address;
	
	public Student() {}

	public Student(int studentId, String studentName, double marks, Set<Course> course, Date dateOfBirth,
			Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.course = course;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
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

	public Set<Course> getCourse() {
		return course;
	}

	public void setCourse(Set<Course> course) {
		this.course = course;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, course, dateOfBirth, marks, studentId, studentName);
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
		return Objects.equals(address, other.address) && Objects.equals(course, other.course)
				&& Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", course="
				+ course + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}
	

	}