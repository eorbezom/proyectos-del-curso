package com.erormar.pe.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.erormar.pe.model.Persona;

@Controller
public class PersonaController {
	
	@GetMapping("/persona")
	public String tablaPersona(Model model) {
		List<Persona> lista = getPersona();
		model.addAttribute("personas", lista);
		return"persona";
	}
	
	
	
	private List<Persona> getPersona(){
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		List<Persona> lista = new LinkedList<Persona>();
		
		try {
			Persona persona1 =new Persona();
			persona1.setId(1);
			persona1.setNombre("larry BILL");
			persona1.setApellido("Orbezo Ramirez");
			persona1.setEdad(10);
			persona1.setfNacimiento(sdf.parse("16-02-2016"));
			persona1.setCasado(false);
			persona1.setFortuna(20.00);
			
			
			Persona persona2 =new Persona();
			persona2.setId(2);
			persona2.setNombre("Juan ");
			persona2.setApellido("Orbezo FIRULAYS");
			persona2.setEdad(35);
			persona2.setfNacimiento(sdf.parse("01-01-2024"));
			persona2.setCasado(true);
			persona2.setFortuna(0.00);
			
			Persona persona3 =new Persona();
			persona3.setId(3);
			persona3.setNombre("Emenigildo");
			persona3.setApellido("Orbezo Martinez");
			persona3.setEdad(2);
			persona3.setfNacimiento(sdf.parse("09-07-1991"));
			persona3.setCasado(false);
			persona3.setFortuna(1000.00);
			
			Persona persona4 =new Persona();
			persona4.setId(4);
			persona4.setNombre("Anonimus");
			persona4.setApellido("fututro proyecto");
			persona4.setEdad(30);
			persona4.setfNacimiento(sdf.parse("05-05-1995"));
			persona4.setCasado(true);
			persona4.setFortuna(0.00);
			
			
			lista.add(persona1);
			lista.add(persona2);
			lista.add(persona3);
			lista.add(persona4);
			
			
		} catch (ParseException e) {
			System.out.print("Error de datos: "+e.getMessage());
		}
		
		
		
		
		
		
		return lista;
	}
	
	
	
	
}
