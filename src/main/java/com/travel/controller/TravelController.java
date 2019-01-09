package com.travel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class TravelController {
	
	@GetMapping("/hello")
	public void hello() {
		log.info("hello.....................");
	}
	
	@GetMapping("/sample")
	public String greeting(Model model) {
		
		model.addAttribute("greeting", "안녕 타임리프!");
		log.info("greeting...");
		
		return "sample";
		
	}
	
	@GetMapping("/index")
	public void main() {
		log.info("main start");
	}
	

}
