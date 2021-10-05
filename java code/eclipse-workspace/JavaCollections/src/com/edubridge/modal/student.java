package com.edubridge.modal;

import java.util.Objects;

public class student implements Comparable<student>  {
	private int id;
	private String name;
	private int marks;
	public student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(100 * Math.random());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return id == other.id && marks == other.marks && Objects.equals(name, other.name);
	}
	public student() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	