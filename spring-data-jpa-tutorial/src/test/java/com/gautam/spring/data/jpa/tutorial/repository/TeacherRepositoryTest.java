package com.gautam.spring.data.jpa.tutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.gautam.spring.data.jpa.tutorial.entity.Course;
import com.gautam.spring.data.jpa.tutorial.entity.Teacher;

@SpringBootTest
public class TeacherRepositoryTest {
	
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Test
	public void saveTeacher() {
		
		Course courseBBA=Course.builder()
				.title("BBA")
				.credit(4)
				.build();
		
		Course courseMBA=Course.builder()
				.title("MBA")
				.credit(4)
				.build();
		Course courseBCA=Course.builder()
				.title("BCA")
				.credit(4)
				.build();
		Course courseMCA=Course.builder()
				.title("MCA")
				.credit(4)
				.build();
		Teacher teacher=Teacher.builder()
				.firstName("Kaushal")
				.lastName("Mehta")
//				.courses(List.of(courseBBA,courseMBA,courseBCA,courseMCA))
				.build();
		teacherRepository.save(teacher);
	}

}
