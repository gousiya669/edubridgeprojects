
package com.edubridge.hibernate.dao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.edubridge.hibernate.entities.Course;
import com.edubridge.hibernate.util.HibernateUtil;



public class CourseDao {
	
	public List<Course> getAllCourses(){
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	
	Query query = session.createQuery("from Course");
	List<Course> courseList = query.getResultList();
	
	session.close();
	sessionFactory.close();
	return courseList;

}
	
	public void saveCourse(Course course) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(course);
		txn.commit();
		session.close();
		sessionFactory.close();
		
	}
	
	public void deleteCourse(Course course) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.delete(course);
		txn.commit();
		session.close();
		sessionFactory.close();
		
		
	}
	public void updateCourse(Course course) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.update(course);
		txn.commit();
		session.close();
		sessionFactory.close();
		
		
	}
	
}
