package com.edubridge.hello.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.hello.spring.beans.HelloSpringBean;
import com.edubridge.hello.spring.beans.AddBean;
import com.edubridge.hello.spring.beans.ByeSpringBean;
public class AddContextXml{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");

AddBean ab=(AddBean) appContext.getBean("addition");

ab.sayBye(3, 7);
}
}