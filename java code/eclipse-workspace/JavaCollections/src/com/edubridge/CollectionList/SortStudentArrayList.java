package com.edubridge.CollectionList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.edubridge.modal.student;

public class SortStudentArrayList {

	public static void main(String[] args) {
		ArrayList<student> studList = new ArrayList<>();
		
		studList.add(new student(3,"loki",88));
		studList.add(new student(4,"nithila",78));
		studList.add(new student(2,"sheeba",66));
		studList.add(new student(1,"azmina",77));
		studList.add(new student(6,"gayathri",99));

		System.out.println(studList);
		Collections.sort(studList);
		System.out.println(studList);
		
		studList.sort(Comparator.comparing(student::getName));
		System.out.println(studList);
	}

}
