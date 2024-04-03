package com.HAH.mapping.model.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HAH.mapping.model.dto.Course;
import com.HAH.mapping.model.dto.JavaCourseLevel;

@Service
public class CourseService {
//	This is manual
//	@Autowired
//	private CourseCodeGenerator codeGenerator;
//
//	private List<Course> courseRepo;
//
//	public CourseService() {
//		courseRepo = new ArrayList<>();
//	}
//
//	@PostConstruct
//	public void init() {
//		create(new Course("Java Basic", 4, JavaCourseLevel.Basic, 180000));
//		create(new Course("Spring", 5, JavaCourseLevel.Intermediate, 180000));
//		create(new Course("Angular", 3, JavaCourseLevel.Advance, 180000));
//		create(new Course("React", 3, JavaCourseLevel.Advance , 180000));
//
//	}
//
//	public int create(Course c) {
//		var id = codeGenerator.next();
//		c.setId(id);
//		courseRepo.add(c);
//		return id;
//	}
//
//	public Course findById(int id) {
//		return courseRepo.stream().filter(c -> c.getId() == id).findAny().orElse(null);
//	}
//
//	public List<Course> getAllCourses() {
//		return List.copyOf(courseRepo);
//	}

}
