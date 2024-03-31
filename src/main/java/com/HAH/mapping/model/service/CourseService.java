package com.HAH.mapping.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HAH.mapping.model.dto.Course;

@Service
public class CourseService {

	@Autowired
	private CourseCodeGenerator codeGenerator;

	private List<Course> courseRepo;

	public CourseService() {
		courseRepo = new ArrayList<>();
	}

	public int create(Course c) {
		var id = codeGenerator.next();
		c.setId(id);
		courseRepo.add(c);
		return id;
	}

	public Course findById(int id) {
		return courseRepo.stream().filter(c -> c.getId() == id).findAny().orElse(null);
	}

	public List<Course> getAllCourses() {
		return List.copyOf(courseRepo);
	}

}
