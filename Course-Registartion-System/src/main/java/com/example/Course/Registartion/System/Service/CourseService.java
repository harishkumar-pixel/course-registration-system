package com.example.Course.Registartion.System.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Course.Registartion.System.Repository.CourseRegistryRepo;
import com.example.Course.Registartion.System.Repository.CourseRepo;
import com.example.Course.Registartion.System.model.CourseRegistry;
import com.example.Course.Registartion.System.model.course;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo; 
	
	public List<course> availableCourses() {
		
		return courseRepo.findAll();
	}
	
	@Autowired
	CourseRegistryRepo courseRegistryRepo;
	
	public List<CourseRegistry> enrolledStudents() {
		// TODO Auto-generated method stub
		return courseRegistryRepo.findAll();
	}
	
	
	public void enrollCourse(String name, String emailId, String courseName) {
		CourseRegistry courseRegistry = new CourseRegistry(name,emailId,courseName);
		courseRegistryRepo.save(courseRegistry);
		
		
	}

}
