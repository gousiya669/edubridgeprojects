package com.edubridge.CollectionList;

import java.util.ArrayList;

import com.edubridge.modal.student;

public class studentArrayList {

	public static void main(String[] args) {
		ArrayList<student> studentList = new ArrayList<>();
		
		student st1 = new student(10,"sheeba",80);
		student st2 = new student();
		st2.setId(4);
		st2.setMarks(90);
		st2.setName("sadaf");
		
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(new student(3,"gayathri",98));
		System.out.println("Student List:" +studentList);
		
		for(int i=0; i< studentList.size(); i++) {
			student oStudent = studentList.get(i);
			System.out.println("Name:" +oStudent.getName());
		}
		for(student objStudent : studentList) {
			System.out.println(objStudent.getId()+"" +objStudent.getName()+""+objStudent.getMarks());
		}
			
		}
		

	}


