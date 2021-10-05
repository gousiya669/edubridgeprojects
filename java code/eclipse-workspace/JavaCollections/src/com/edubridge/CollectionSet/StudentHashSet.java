package com.edubridge.CollectionSet;

import java.util.HashSet;
import java.util.Set;

import com.edubridge.modal.student;

public class StudentHashSet {

	public static void main(String[] args) {
	Set<student> studentSet = new HashSet<student>();
	

	studentSet.add(new student(1,"Arun",80));
	studentSet.add(new student(6,"nithila",85));
	studentSet.add(new student(3,"syed",70));
	studentSet.add(new student(2,"jay",80));
	studentSet.add(new student(2,"jay",80));
	System.out.println(studentSet+"" +studentSet.size());
	for(student st : studentSet) {
		System.out.println(st.getName()+":"+st.hashCode());
	}

	}

}
