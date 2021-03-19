package co.edu.poli.libros.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.libros.dto.AutoresDTO;
import co.edu.poli.libros.servicios.AutoresService;

@RestController
@RequestMapping("/api")
public class AutoresRestController {

	@Autowired
	private AutoresService service;
	
	@GetMapping("/libros")
	public List<AutoresDTO> getAutores(){
		return service.findAll();
	}
}
