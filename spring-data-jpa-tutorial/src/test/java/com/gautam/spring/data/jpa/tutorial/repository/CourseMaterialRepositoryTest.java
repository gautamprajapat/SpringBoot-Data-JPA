package com.gautam.spring.data.jpa.tutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gautam.spring.data.jpa.tutorial.entity.Course;
import com.gautam.spring.data.jpa.tutorial.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository repository;
	
	@Test
	public void  saveCourseMaterial() {
		
		
		Course course=Course.builder()
				.title("DSA")
				.credit(6)
				
				.build();
		
		
		CourseMaterial courseMaterial=CourseMaterial.builder()
				
				.url("www.udemy.com")
				.course(course)
				
				.build();
		repository.save(courseMaterial);
	}
	
	@Test
	public void printAllCurseMaterial() {
		
		List<CourseMaterial>courseMaterials=repository.findAll();
		System.out.println("Course Material :"+ courseMaterials);
		
	}
	

}
