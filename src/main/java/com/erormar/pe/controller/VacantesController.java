package com.erormar.pe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vacantes")

public class VacantesController {
	
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int IdVacante, Model model) {
		System.out.println("IdVacantes  es :"+ IdVacante);
		model.addAttribute("idVacante", IdVacante);
		return "vacantes/detalle";
		
	}

}
