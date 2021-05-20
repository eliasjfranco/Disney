package com.disney.controller;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.disney.service.Personaje_Service;
import com.disney.model.Mensaje;
import com.disney.model.Personaje;

@RestController
@CrossOrigin
public class Controller {
	
	@Resource(name="PersonajeService")
	Personaje_Service pService;
	
	@GetMapping(value="/characters")
	public List<Personaje> personajes(@RequestParam(value="age", required = false)String edad,
							   				 @RequestParam(value="name", required = false)String nombre,
							   				 @RequestParam(value="movies", required = false)String peli) throws Exception{
		List<Personaje> personaje = new ArrayList<Personaje>();
		if(edad!=null || nombre!=null|| peli!=null) {
			if(edad!=null)
				personaje = pService.findByEdad(Integer.parseInt(edad));
			if(nombre!=null)
				personaje = pService.findByNombre(nombre);
			if(peli!=null)
				personaje = pService.findByPelicula(peli);
		}else
			personaje = pService.getAll();
		return personaje;
	}
	
	@PostMapping(value="/characters")
	public ResponseEntity<?> crearPersonjae(@RequestBody Personaje personaje, BindingResult result){
		
		if(result.hasErrors()) {
			return new ResponseEntity<>(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);
		}
		if(pService.existByName(personaje.getNombre())) {
			return new ResponseEntity<>(new Mensaje("El personaje ya existe"), HttpStatus.BAD_REQUEST);
		}
		if(personaje.getNombre().length()<3) {
			return new ResponseEntity<>(new Mensaje("El nombre no puede estar vacío"), HttpStatus.BAD_REQUEST);
		}
		pService.save(personaje);
		return ResponseEntity.ok(new Mensaje("Usuario creado"));
	}
	
	@PutMapping(value="/characters")
	public ResponseEntity<?> modificarPersoaje(@RequestBody Personaje personaje, BindingResult result){
		
		if(result.hasErrors()) {
			return new ResponseEntity<>(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);
		}
		if(!pService.existByName(personaje.getNombre())) {
			return new ResponseEntity<>(new Mensaje("El personaje no existe"), HttpStatus.BAD_REQUEST);
		}else {
			pService.updatePersonaje(personaje);
			return new ResponseEntity<>(new Mensaje("Personaje modificado con exito!"), HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(value="/characters")
	public void eliminarPersonaje(@RequestParam(value="name")String nombre) {
		pService.deletePersonaje(nombre);
	}
	
	
}