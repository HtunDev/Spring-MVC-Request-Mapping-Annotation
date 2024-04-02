package com.HAH.mapping.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.HAH.mapping.model.dto.JavaCourseLevel;

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

	@GetMapping("/matrix/{product}")
	public String matrixProduct(@PathVariable String product, @MatrixVariable(required = false) String size,
			@MatrixVariable(required = false, defaultValue = "1") Integer count, Model model) {
		var message = "Product : %s, Size : %s, Count : %d".formatted(product, size, count);
		model.addAttribute("product", message);
		return "inputs";
	}

	@GetMapping("/request")
	public String usingRequestParam(@RequestParam String product,
			@RequestParam(required = false, defaultValue = "30") Integer width,
			@RequestParam(required = false, defaultValue = "30") Integer length, Model model) {

		var requestParamMessage = "Product : %s, Width : %d, Length : %d".formatted(product, width, length);
		model.addAttribute("requestParamMessage", requestParamMessage);
		return "inputs";
	}
}
