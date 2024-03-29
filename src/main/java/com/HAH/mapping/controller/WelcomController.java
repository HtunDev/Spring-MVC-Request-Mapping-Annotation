package com.HAH.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomController {

	@RequestMapping({ "/", "/home" })
	public String index() {
		return "home";
	}
}
