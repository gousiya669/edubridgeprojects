
package com.edubridge.hibernate.main;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


import com.edubridge.hibernate.dao.CourseDao_EM;
import com.edubridge.hibernate.dao.StudentDao;
import com.edubridge.hibernate.entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		

		StudentDao studentDao = new StudentDao();
		CourseDao_EM courseDao = new CourseDao_EM();
		
		Student student = new Student();
		
		student.setStudentId(10);
		student.setStudentName("tom");
		student.setMarks(75.5);
		//student.setCourseId("C008");
		//student.setCourse(courseDao.getCourseById("c007"));
		try {
			student.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").parse("30/09/1990"));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		 studentDao.saveStudent(student);
		List<Student> studentList = studentDao.getAllStudents();
		studentList.forEach(s ->
		       // System.out.println(s.getStudentId()+" "+s.getStudentName()+" "+s.getCourse().getCourseName())
				);

	}

}
