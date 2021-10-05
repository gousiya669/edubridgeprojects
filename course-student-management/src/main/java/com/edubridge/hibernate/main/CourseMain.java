package com.edubridge.hibernate.main;

import java.util.List;

import com.edubridge.hibernate.dao.CourseDao;
import com.edubridge.hibernate.entities.Course;

public class CourseMain {

	public static void main(String[] args) {
		
		Course course = new Course();
		course.setCourseId("c006");
		course.setCourseName("SQL");
		Course course1 = new Course();
		course1.setCourseId("c007");
		course1.setCourseName("some different course");
		Course course2 = new Course();
		course2.setCourseId("c018");
		course2.setCourseName("mysql");
		
		CourseDao courseDao = new CourseDao();
		//courseDao.saveCourse(course1);
		//courseDao.saveCourse(course);
		courseDao.deleteCourse(course1);
		courseDao.updateCourse(course);
		//courseDao.saveOrUpdateCourse(course2);
		
		
		List<Course> courseList = courseDao.getAllCourses();
		courseList.forEach(c ->
		System.out.println(c.getCourseId()+ "" +c.getCourseName())
		);
		
	}

}

		