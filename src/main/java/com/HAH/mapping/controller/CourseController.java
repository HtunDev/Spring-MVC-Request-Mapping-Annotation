package com.HAH.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.HAH.mapping.model.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@GetMapping
	public ModelAndView index() {
		var mv = new ModelAndView();
		mv.getModel().put("list", courseService.getAllCourses());
		mv.setViewName("course-list");
		return mv;
	}

}
