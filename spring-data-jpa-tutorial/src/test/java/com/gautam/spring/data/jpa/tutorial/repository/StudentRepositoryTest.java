package com.gautam.spring.data.jpa.tutorial.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.gautam.spring.data.jpa.tutorial.entity.Guardian;
import com.gautam.spring.data.jpa.tutorial.entity.Student;

@SpringBootTest
//@DataJpaTest
public class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void saveStudent() {
		
		Student student=Student.builder()
				.emailId("gautam@gmail.com")
				.firstName("Gautam")
				.lastName("Prajapati")
//				.gaurdianName("Ram Pal")
//				.gaurdianEmail("rampal@gmail.com")
//				.gaurdianMobile("9998887687")
				.build();
		
		studentRepository.save(student);
		
	}
	@Test
	public void printAllStudent() {
		List<Student>students=studentRepository.findAll();
		System.out.println("Student List: "+ students);
		
	}
	
	@Test
	public void saveStudentWithGaurdian() {
		
		Guardian guardian=Guardian.builder()
				.name("Nikhil")
				.email("nikhil@gmail.com")
				.mobile("3454567898")
				.build();
		
		Student student=Student.builder()
				.firstName("Shivam")
				.lastName("Gupta")
				.emailId("shivam@gmail.com")
				.guardian(guardian)
		
				
				.build();
		
		studentRepository.save(student);
	}
	
	@Test
	public void printStudentByFirstName() {
		
		List<Student>studentList=studentRepository.findByFirstName("Gautam");
		System.out.println("Students  :"+studentList);
	}
	
	@Test
	public void printStudentByLastName() {
		
		List<Student>studentList=studentRepository.findByLastName("Prajapati");
		System.out.println("Students  :"+studentList);
	}
	
	@Test
	public void printStudentByFirstNameContaining() {
		
		List<Student>studentList=studentRepository.findByFirstNameContaining("tam");
		System.out.println("Students  :"+studentList);
	}
	
	
	
	@Test
	public void printStudentByGuardianName() {
		
		List<Student>studentList=studentRepository.findByGuardianName("Nikhil");
		System.out.println("Students  :"+studentList);
	}
	
	
	@Test
	public void printStudentByFirstNameAndLastName() {
		Student studentList=studentRepository.findByFirstNameAndLastName("Gautam","Prajapati");
		System.out.println("Students  :"+studentList);
	}
	
	@Test
	public void printgetStudentByEmailAddress() {
		
		Student student=studentRepository.getStudentByEmailAddress("gautam@gmail.com");
		System.out.println("Students  :"+student);
	}
	
	
	
	@Test
	public void printgetStudentByEmailAddressNative() {
		
		Student student=studentRepository.getStudentByEmailAddressNative("gautam@gmail.com");
		System.out.println("Students  :"+student);
	}
	
	
	
	
	@Test
	public void printgetStudentByEmailAddressNativeNamedParam() {
		
		Student student=studentRepository.getStudentByEmailAddressNativeNamedParam("gautam@gmail.com");
		System.out.println("Students  :"+student);
	}
	
	
	  @Test
	    public void updateStudentNameByEmailIdTest() {
	        studentRepository.updateStudentNameByEmailId(
	                "Gaurav dawoodi",
	                "gautam@gmail.com");
	    }

	
	
	

}
