package com.napmkmk.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping(value = "/")
	public String home() {
		
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping(value = "/content")
	public String content() {
		
		return "content";
	}
}
