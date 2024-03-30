package com.HAH.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/multiAction")
public class MultiActionsController {

	@RequestMapping
	public void index() {
	}

	@RequestMapping(value = "/action1",method = RequestMethod.GET)
	public String action1(ModelMap model) {
		model.put("message", "message from action 1");
		return "multiAction";
	}
	
	@GetMapping(value = "/action2")
	public String action2(ModelMap model) {
		model.put("message", "message from action 2");
		return "multiAction";
	}
	
	@GetMapping(value = "/action2",params = "id")
	public String action2WithId(ModelMap model) {
		model.put("message", "message from action 2 with id");
		return "multiAction";
	}
	
	@GetMapping("{:\\d+}")
	public String action2WithDigit(ModelMap model) {
		model.put("message", "message from action 2 with digit");
		return "multiAction";
	}
	
	@RequestMapping("**")
	public String action3WithWildCart(ModelMap model) {
		model.put("message", "wild cart");
		return "multiAction";
	}
	
}
