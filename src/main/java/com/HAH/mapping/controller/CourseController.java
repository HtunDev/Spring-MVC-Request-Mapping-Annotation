package com.HAH.mapping.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.HAH.mapping.model.dto.Course;
import com.HAH.mapping.model.dto.JavaCourseLevel;
import com.HAH.mapping.model.dto.Result;
import com.HAH.mapping.model.dto.Result.Status;
import com.HAH.mapping.model.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;

//	This is return model and view
//	@GetMapping
//	public ModelAndView index() {
//		var mv = new ModelAndView();
//		mv.getModel().put("list", courseService.getAllCourses());
//		mv.setViewName("course-list");
//		return mv;
//	}

	@GetMapping
	public String index(Map<String, Object> model) {
		model.put("list", courseService.getAllCourses());
		return "course";
	}

	@GetMapping("/edit")
	public String editCourse() {
		return "course-edit";
	}

//	This is using flashAttribute
	@PostMapping
	public String saveCourse(@RequestParam String name, @RequestParam int duration, @RequestParam JavaCourseLevel level,
			@RequestParam int fees, RedirectAttributes redirect) {
		var course = new Course(name, duration, level, fees);
		var courseId = courseService.create(course);
		redirect.addFlashAttribute("result", "New Course has been created!");
		return "redirect:course/%d".formatted(courseId);
	}

	@GetMapping("{id:\\d+}")
	public String findById(@PathVariable(value = "id") int courseId, ModelMap model) {
		model.put("course", courseService.findById(courseId));
		return "course-details";
	}
}
