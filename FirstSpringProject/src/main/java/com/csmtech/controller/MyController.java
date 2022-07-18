package com.csmtech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(path="/test")
	public String test() {
		return "myPage";
		
	}

}
