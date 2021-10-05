package com.edubridge.hello.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.edubridge.hello.spring.beans.HelloSpringBean;
@Configuration
public class AppConfigAnnotation {

	@Bean
	HelloSpringBean helloSpringAnnotation() {
		return new HelloSpringBean();
	}
	public static void main(String[] args) {
		ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConfigAnnotation.class);
       HelloSpringBean hsb =(HelloSpringBean)appContext.getBean("helloSpringAnnotation");
       hsb.sayHello();
	}

}
