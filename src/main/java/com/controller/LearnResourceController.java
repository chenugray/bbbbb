package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.User;

@Controller
@RequestMapping("/learn")
public class LearnResourceController {
	@RequestMapping("")
	public ModelAndView index() {
		List<User> learnList = new ArrayList<User>();
		learnList.add(new User());
		ModelAndView modelAndView = new ModelAndView("/aa");
		modelAndView.addObject("learnList", learnList);
		return modelAndView;
	}
}