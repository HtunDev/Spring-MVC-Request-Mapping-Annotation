package com.HAH.mapping.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inputs")
public class UrlInputsController {

	@GetMapping
	public void index() {
	}

	@GetMapping("{type}/search/{id}")
	public String findByType(@PathVariable("type") String inputType, @PathVariable Integer id, Model model) {
		model.addAttribute("type", inputType);
		model.addAttribute("id", id);
		return "inputs";
	}

	@GetMapping("{date:\\d{4}-\\d{2}-\\d{2}}")
	public String findByDate(@PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date, Model model) {
		model.addAttribute("date", date);
		return "inputs";
	}

	@GetMapping("{level:Basic|Advance|Intermediate}")
	public String findByLevel(@PathVariable JavaCourseLevel level, Model model) {
		model.addAttribute("level", level);
		return "inputs";
	}
}
