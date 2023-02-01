package ca.sheridan.khawasiq.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import ca.sheridan.khawasiq.beans.Student;

public class HomeController {
	
	private Student stu;
	
	@Autowired 
	public HomeController(Student st) {
		this.stu = st;
		
	}

}
