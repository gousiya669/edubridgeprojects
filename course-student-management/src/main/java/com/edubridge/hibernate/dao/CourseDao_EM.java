package com.edubridge.hibernate.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.edubridge.hibernate.entities.Course;

public class CourseDao_EM {
	public EntityManager getEntityManager(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sheeba");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
    }
 
	public void saveCourse(Course course) {
		EntityManager entityManager = getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(course);
		entityManager.getTransaction().commit();
		entityManager.close();
    }
 
	public List<Course> getAllCourses() {
		EntityManager entityManager = getEntityManager();
		List<Course> courseList = entityManager.createQuery("from Course", Course.class).getResultList();
		entityManager.close();
		return courseList;
		
    }
 
	public void updateCourse() {
		
    }
 
	public void deleteCourse() {
    }
	
	public Course getCourseById(String course_id) {
		EntityManager entityManager = getEntityManager();
		Course course = entityManager.find(Course.class, course_id);
		entityManager.close();
		return course;
	}

}
