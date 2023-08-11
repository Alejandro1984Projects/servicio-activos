package com.development_time.servicio_activos.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.development_time.servicio_activos.interfazjpa.InterfazJpa;
import com.development_time.servicio_activos.modelo.Activos;

@RestController
@RequestMapping("servicio-activos")
public class Servicio {
	
	@Autowired
	private InterfazJpa interfazjpa;
	
	@PostMapping("/crear")
	public void crear(@RequestBody Activos activo) {
		
		interfazjpa.save(activo);
		
	}
	
	@PostMapping("/leer")
	public List<Activos> leer(){
		
		return interfazjpa.findAll();
		
	}
	
	@PostMapping("/actualizar")
	public void actualizar(@RequestBody Activos activo) {
		
		interfazjpa.save(activo);
		
	}
	
	@PostMapping("/borrar/{id}")
	public void borrar(@PathVariable(value="id") Integer id) {
		
		interfazjpa.deleteById(id);
		
	}

}
