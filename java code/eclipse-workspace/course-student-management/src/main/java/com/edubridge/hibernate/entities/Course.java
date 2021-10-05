package com.edubridge.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")

public class Course {

	@Id
	@Column(name="course_id")
	private String CourseId;
	
	 @Column(name="course_name")
	private String CourseName;
	
	public Course() {
		
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CourseId == null) ? 0 : CourseId.hashCode());
		result = prime * result + ((CourseName == null) ? 0 : CourseName.hashCode());
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
		Course other = (Course) obj;
		if (CourseId == null) {
			if (other.CourseId != null)
				return false;
		} else if (!CourseId.equals(other.CourseId))
			return false;
		if (CourseName == null) {
			if (other.CourseName != null)
				return false;
		} else if (!CourseName.equals(other.CourseName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", CourseName=" + CourseName + "]";
	}
	
}