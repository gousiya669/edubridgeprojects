package com.edubridge.hello.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edubridge.hello.spring.beans.HelloSpringBean;
import com.edubridge.hello.spring.beans.ByeSpringBean;
public class ApplicationConfigXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext appContext=new ClassPathXmlApplicationContext("applicationContext.xml");

HelloSpringBean hsb=(HelloSpringBean) appContext.getBean("helloSpring");
hsb.sayHello();

HelloSpringBean hsb1=(HelloSpringBean) appContext.getBean("helloSpring");
hsb.sayBye(4, 3);


}
}