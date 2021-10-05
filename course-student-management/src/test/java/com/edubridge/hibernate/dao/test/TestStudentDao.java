package com.edubridge.hibernate.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.edubridge.hibernate.dao.CourseDao_EM;
import com.edubridge.hibernate.dao.StudentDao;
import com.edubridge.hibernate.entities.Address;
import com.edubridge.hibernate.entities.Course;
import com.edubridge.hibernate.entities.Student;

class TestStudentDao {

	@Test
	void testgetAllStudentByNameSheeba() {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.getAllStudentByNameSheeba();
		studentList.forEach(s->
		System.out.println(s.getStudentId()+ " " +s.getStudentName())
		);
	}
		@Test
	
		void testgetAllStudentByName() {
			StudentDao studentDao = new StudentDao();
			List<Student> studentList = studentDao.getAllStudentByName("sadaf");
			studentList.forEach(s->
			System.out.println(s.getStudentId()+ " " +s.getStudentName())
			);
			
	}
		@Test
		
		void testgetAllStudentByMarks() {
			StudentDao studentDao = new StudentDao();
			List<Student> studentList = studentDao.getAllStudentByMarks(75);
			studentList.forEach(s->
			System.out.println(s.getStudentId()+ " " +s.getStudentName())
			);
			
	}
@Test
		
		void testgetAllStudentByCourse() {
			StudentDao studentDao = new StudentDao();
			List<Student> studentList = studentDao.getAllStudentByCourse("html");
			studentList.forEach(s->
			System.out.println(s.getStudentId()+ " " +s.getStudentName())
			);
			
	}
@Test
void testgetAllStudentByNameStartsWith() {
	StudentDao studentDao = new StudentDao();
	List<Student> studentList = studentDao.getAllStudentByNameStartsWith("s");
	studentList.forEach(s->
	System.out.println(s.getStudentId()+ " " +s.getStudentName())
	);
	
}
	@Test
	void testgetAllStudentByNameS() {
		StudentDao studentDao = new StudentDao();
		List<Student> studentList = studentDao.getAllStudentByNameS();
		studentList.forEach(s->
		System.out.println(s.getStudentId()+ " " +s.getStudentName())
		);


}
	@Test
	void testSaveStudentWithManyCourse() {
	
	StudentDao studentDao = new StudentDao();
	CourseDao_EM courseDao = new CourseDao_EM();
	Set<Course> courseSet = new HashSet<>();
	courseSet.add(courseDao.getCourseById("c007"));
	courseSet.add(courseDao.getCourseById("c009"));
	
	
	
	Student student = new Student();
	
	student.setStudentId(12);
	student.setStudentName("tokyo");
	student.setMarks(75.5);
	//student.setCourseId("C008");
	//student.setCourse(courseDao.getCourseById("c007"));
	student.setCourse(courseSet);
	try {
		student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("30/09/2021"));
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	 studentDao.saveStudent(student);
	List<Student> studentList = studentDao.getAllStudents();
	studentList.forEach(s ->
	        System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getCourse())
			);

}
	@Test
	void testSaveStudentWithManyAddress() {
		Address address = new Address();
		address.setAddressLine1("Address Line 1");
		address.setState("Kar");
		address.setCountry("India");
		
	
	StudentDao studentDao = new StudentDao();
	CourseDao_EM courseDao = new CourseDao_EM();
	Set<Course> courseSet = new HashSet<>();
	courseSet.add(courseDao.getCourseById("c007"));
	courseSet.add(courseDao.getCourseById("c009"));
	
	
	
	Student student = new Student();
	
	student.setStudentId(14);
	student.setStudentName("tokyo");
	student.setMarks(75.5);
	//student.setCourseId("C008");
	//student.setCourse(courseDao.getCourseById("c007"));
	student.setCourse(courseSet);
	try {
		student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("30/09/2021"));
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
	student.setAddress(address);
	 studentDao.saveStudent(student);
	List<Student> studentList = studentDao.getAllStudents();
	studentList.forEach(s ->
	        System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getCourse())
			);

}

}
