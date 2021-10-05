package com.edubridge.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.edubridge.collection.modal.Student;

public class SortStudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<>();
		
		studList.add(new Student(3,"Loki", 88.5));
		studList.add(new Student(2, "Nithila", 75));
		studList.add(new Student(1,"Azmina", 50));
		studList.add(new Student(6,"Vijay", 75));
		studList.add(new Student(5,"Gayathri",80.5));
		
		System.out.println(studList);
		
		Collections.sort(studList); //sort by ID
		System.out.println(studList);
		
		studList.sort(Comparator.comparing(Student::getName)); //sort by Name
		System.out.println(studList);
		
		studList.sort(Comparator.comparing(Student::getMarks, 
				Collections.reverseOrder()));
		System.out.println(studList);

	}

}
