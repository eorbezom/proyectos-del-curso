package com.erormar.pe.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.erormar.pe.EmpleosApplication;
import com.erormar.pe.model.Vacante;


@Controller
public class HomeController {

       
   //AGREGAMOS LA LSITA DE OMBJETOS DEL METODO GETVACANTES
	@GetMapping("/tabla")
	public String tablaEmpleos(Model model) {
		List<Vacante> lista = getVacantes();
		model.addAttribute("vacantes", lista);
		
		
		
		return"tabla";
	}
	
	
	
	
	
	
	@GetMapping("/")
	public String mimetodo(Model model) {		
		model.addAttribute("mensaje", "hola desde el controller y para el mundo entero");
		model.addAttribute("fecha", new Date()); 
		
		return"home";
	}
	@GetMapping("/acerca")
	public String metodoAcerca(Model model) {
		model.addAttribute("acerca", "hola acerca desde controller pipippip");
		return "acerca";
	}
	
	
	@GetMapping("/trabajo")
	public String trabajoNuevo(Model model) {
		
		String nombre= "Desarrollador  de software";
		boolean experiencia = true;
		double salario =2500.1;
		Date fechaPubli =new Date();
		boolean vigencia = true;
		
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("experiencia", experiencia);
		model.addAttribute("sueldo", salario);
		model.addAttribute("fecha", fechaPubli);
		model.addAttribute("vigencia", vigencia);
		
		return"trabajo";
	}
	
	
	//AQUI SE UTIZA LOS DATOS DE CONTROLLER Y TAMBIEN 
	//DE BASE DATOS QUE NOS DA EL MODEL
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante(); //VARIABLE DE TIPO VACANTE
		
		
		vacante.setId(23);
		vacante.setNombre("Ingeniero de Prgramador");
		vacante.setDescripcion("Se solicita un ingeniero progrador d ealarmas de celular");
		vacante.setFecha(new Date());
		vacante.setSalario(1991.2);
		model.addAttribute("vacante", vacante);
		
		
		
		
		return "detalle";
	}
	
	//SE CREA ESTE METODO PARA LUEGO AGREGARLOS EN EL MODELO
	private List<Vacante> getVacantes() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacante> lista = new LinkedList<Vacante>(); 
		
		try {
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Desarrollador Back End");
			vacante1.setDescripcion("Por motivo de Expancion Empresarial necesita un desarrollador Back End");
			vacante1.setFecha(sdf.parse("24-04-2026"));
			vacante1.setSalario(2500.2);
			vacante1.setDestacado(1);
			
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Desarrollador Fron End");
			vacante2.setDescripcion("Por motivo de Expancion Empresarial necesita un desarrollador Fron End");
			vacante2.setFecha(sdf.parse("24-04-2026"));
			vacante2.setSalario(2200.1);
			vacante2.setDestacado(0);
			
			
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Desarrollador Full Stack");
			vacante3.setDescripcion("Por motivo de Expancion Empresarial necesita un desarrollador Full Stack");
			vacante3.setFecha(sdf.parse("24-04-2026"));
			vacante3.setSalario(4000.0);
			vacante3.setDestacado(1);
			
			
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Tester");
			vacante4.setDescripcion("Por motivo de Expancion Empresarial necesita un tester probador de software");
			vacante4.setFecha(sdf.parse("24-04-2026"));
			vacante4.setSalario(1500.0);
			vacante4.setDestacado(0);
			
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante5 = new Vacante();
			vacante5.setId(5);
			vacante5.setNombre("Jefe QA");
			vacante5.setDescripcion("Por motivo de Expancion Empresarial necesita Jefe QA "
					+ "que puede ocupar el liderasgo que conpacidades comunicativas");
			vacante5.setFecha(sdf.parse("24-04-2026"));
			vacante5.setSalario(4000.0);
			vacante5.setDestacado(0);
			
			
			//CREAMOS UNA FERTA DE TRABAJO
			Vacante vacante6 = new Vacante();
			vacante6.setId(6);
			vacante6.setNombre("Personal de Venntas de sistemas ");
			vacante6.setDescripcion("Por motivo de Expancion Empresarial necesita un vendedor con experiencia");
			vacante6.setFecha(sdf.parse("24-04-2026"));
			vacante6.setSalario(2000.0);
			vacante6.setDestacado(1);
			
			//AGREGAMOS  LOS OBJETOS DE TIPO VACANTE A LA LISTA
			lista.add(vacante1);
			lista.add(vacante2);
			lista.add(vacante3);
			lista.add(vacante4);
			lista.add(vacante5);
			lista.add(vacante6);
			
			
			
		} catch (ParseException e) {
			System.out.print("Error de Cachorro: "+e.getMessage());
		}
		
		
		
		
		return lista;
	}
	
	
}
