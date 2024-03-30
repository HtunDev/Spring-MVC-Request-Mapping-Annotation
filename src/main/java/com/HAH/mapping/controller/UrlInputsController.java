package com.HAH.mapping.controller;

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
}
