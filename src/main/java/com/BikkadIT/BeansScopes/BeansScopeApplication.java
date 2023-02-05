package com.BikkadIT.BeansScopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.BeansScopes.model.Student;

@SpringBootApplication
public class BeansScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BeansScopeApplication.class, args);
	    
		Student student = context.getBean(Student.class);
		System.out.println(student.hashCode());
		System.out.println(context.isSingleton("student"));
		System.out.println(context.isPrototype("student"));
		
		Student student1 = context.getBean(Student.class);
		System.out.println(student1.hashCode());
		System.out.println(context.isSingleton("student"));
		System.out.println(context.isPrototype("student"));
	}
}
