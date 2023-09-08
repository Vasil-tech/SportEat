package com.SportEat.sporteat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DinnerController {
	@GetMapping("/dinner")
	public String main(Model model){
		return "dinner";
	}
}
