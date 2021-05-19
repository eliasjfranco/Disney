package com.disney.controller;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.disney.service.Personaje_Service;
import com.disney.model.Personaje;

@RestController
@CrossOrigin
public class Controller {
	
	@Resource(name="PersonajeService")
	Personaje_Service pService;
	
	@GetMapping("/characters")
	public List<Personaje> allPersonajes() throws Exception{
		
		return pService.getAll();
	}
	
	/*@GetMapping(value="/characters/")
	public Optional<Personaje> obtenerPersonaje(@RequestParam("name") String nombre) throws Exception{
		
		return pService.findByNombre(nombre);
	}*/
	
	/*@RequestMapping("/characters")
	public List<Personaje> obtenerPersonajeEdad(@RequestParam("age") Integer edad) throws Exception{
		System.out.println(edad);
		return pService.findByEdad(edad);
	}*/
	
	
}
