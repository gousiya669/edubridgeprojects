package com.edubridge.collection.list;

import java.util.ArrayList;

import com.edubridge.collection.modal.Student;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<>();
		
		Student st1 = new Student(10,"Arun", 80.5);
		
		Student st2 = new Student();
		st2.setId(4);
		st2.setMarks(90.5);
		st2.setName("Gousiya");
		
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(new Student(3,"Gayathri", 95.5));
		
		System.out.println("Student List: "+studentList);
		
		for(int i = 0; i < studentList.size(); i++) {
			Student oStudent = studentList.get(i);
			System.out.println("Name: "+oStudent.getName());
		}
		
		for(Student objStudent : studentList) {
			System.out.println(objStudent.getId()+" "
					+objStudent.getName()+" "+objStudent.getMarks());
		}
	}
}
