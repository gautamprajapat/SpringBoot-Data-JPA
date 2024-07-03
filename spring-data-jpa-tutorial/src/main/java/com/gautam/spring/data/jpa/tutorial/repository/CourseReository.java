package com.gautam.spring.data.jpa.tutorial.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gautam.spring.data.jpa.tutorial.entity.Course;

@Repository

public interface CourseReository extends JpaRepository<Course, Long> {
	 Page<Course> findByTitleContaining(
	            String title,
	            Pageable pageable);

}
