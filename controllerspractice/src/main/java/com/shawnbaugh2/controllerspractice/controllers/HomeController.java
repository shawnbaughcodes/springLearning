package com.shawnbaugh2.controllerspractice.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/hello")
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "forward:/index.html";
	}
}
