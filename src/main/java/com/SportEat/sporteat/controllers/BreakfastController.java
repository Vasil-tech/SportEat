package com.SportEat.sporteat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BreakfastController {
	@GetMapping("/breakfast")
	public String main(Model model){
		return "breakfast";
	}
}
