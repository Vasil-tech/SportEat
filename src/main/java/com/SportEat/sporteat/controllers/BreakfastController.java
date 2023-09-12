package com.SportEat.sporteat.controllers;

import com.SportEat.sporteat.models.Breakfast;
import com.SportEat.sporteat.repository.breakfastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BreakfastController {
	@Autowired
	private breakfastRepository breakfastRepository;

	@GetMapping("/breakfast")
	public String main(Model model){
		return "breakfast";
	}

	@GetMapping("/breakfast/sport-eat/add")
	public String breakfastAdd(Model model){
		return "sporteat-add";
	}

	@PostMapping("/breakfast/sport-eat/add")
	public String breakfastAdd(@RequestParam String name, @RequestParam String anons, @RequestParam String full_text, Model model){
		Breakfast brfa = new Breakfast(name, anons, full_text);
		breakfastRepository.save(brfa);
		return "redirect:/blog/sport-eat";
	}

	@GetMapping("/breakfast/sport-eat/{id}")
	public String breakfastInfo(@PathVariable(value = "id") long id, Model model){
		if (!breakfastRepository.existsById(id)) {
			return "redirect:/blog/sport-eat";
		}
		Optional<Breakfast> sport = breakfastRepository.findById(id);
		ArrayList<Breakfast> res = new ArrayList<>();
		sport.ifPresent(res::add);
		model.addAttribute("Breakfast", res);
		return "sporteat-info";
	}
}
