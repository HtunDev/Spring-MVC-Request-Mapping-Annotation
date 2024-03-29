package com.HAH.mapping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/multiAction")
public class MultiActionsController {

	@RequestMapping
	public void index() {
	}

	@RequestMapping("/action1")
	public String action1(ModelMap model) {
		model.put("action1Message", "message from action 1");
		return "multiAction";
	}
}
