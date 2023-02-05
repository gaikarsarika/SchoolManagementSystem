package com.BikkadIT.BeansScopes.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

	public Student() {
		super();
		System.out.println("Student Class Constructor");
	}

	
}
