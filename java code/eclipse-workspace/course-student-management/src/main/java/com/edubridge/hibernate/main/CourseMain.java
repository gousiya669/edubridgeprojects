package com.edubridge.hibernate.main;

import java.util.List;
import com.edubridge.hibernate.dao.CourseDao;
import com.edubridge.hibernate.entities.Course;

public class CourseMain {

	public static void main(String[] args) {
	
	
		Course course = new Course();
		course.setCourseId("c011");
		course.setCourseName("some course1");
		
		Course course1 = new Course();
		course1.setCourseId("c010");
		course1.setCourseName("some other course");
		
		
		CourseDao courseDao = new CourseDao();
		
//		courseDao.saveCourse(course);
//		courseDao.saveCourse(course1);
		
		
		courseDao.updateCourse(course);
		courseDao.deleteCourse(course1);
		
		List<Course> courseList = courseDao.getAllCourses();
		courseList.forEach(c ->
		System.out.println(c.getCourseId()+ " " +c.getCourseName())
		);
}
}