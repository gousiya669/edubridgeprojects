package com.edubridge.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.edubridge.hibernate.entities.Student;

public class StudentDao {
	
	public EntityManager getEntityManager(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
    }
	
	public List<Student> getAllStudents(){
		EntityManager entityManager = getEntityManager();
		List<Student> studentList = entityManager.createQuery("from Student", Student.class)
				.getResultList();
		entityManager.close();
		return studentList;
	}
	
	public void saveStudent(Student student) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		entityManager.close();
	}
	
	public List<Student> getAllStudentByNameGousiya() {
		EntityManager entityManager = getEntityManager();
		List<Student> studentList = entityManager.createQuery("from Student where studentName = 'gousiya'",Student.class)
				.getResultList();
		entityManager.close();
		return studentList;
	}
	
	//SQL: select * from students where student_name = ?
	//JPQL: select s from Student s where s.studentName = :name
	public List<Student> getAllStudentByName(String studentName){
		EntityManager entityManager = getEntityManager();
		TypedQuery<Student> query = entityManager.createQuery("select s from Student s where s.studentName = :name",Student.class);
		query.setParameter("name", studentName);
		List<Student> studentList = query.getResultList();
		entityManager.close();
		return studentList;
	}
	
	public List<Student> getAllStudentByMarks(double marks){
		EntityManager entityManager = getEntityManager();
		TypedQuery<Student> query = entityManager.createNamedQuery("findAllStudentByMarks", Student.class);
		query.setParameter("marks", marks);
		List<Student> studentList = query.getResultList();
		entityManager.close();
		return studentList;
	}
	
	public List<Student> getAllStudentByCourse(String courseName){
		EntityManager entityManager = getEntityManager();
		TypedQuery<Student> query = entityManager.createNamedQuery("findAllStudentByCourse", Student.class);
		query.setParameter("courseName", courseName);
		List<Student> studentList = query.getResultList();
		entityManager.close();
		return studentList;
	}

}