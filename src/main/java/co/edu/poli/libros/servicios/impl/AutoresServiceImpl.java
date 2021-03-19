package co.edu.poli.libros.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.libros.dto.AutoresDTO;
import co.edu.poli.libros.entidades.Autores;
import co.edu.poli.libros.repository.AutoresRepository;
import co.edu.poli.libros.servicios.AutoresService;

@Service
public class AutoresServiceImpl implements AutoresService {

	@Autowired
	private AutoresRepository repo;
	
	@Override
	public List<AutoresDTO> findAll() {
		List<AutoresDTO> lstAutores = new ArrayList<AutoresDTO>();
		AutoresDTO a;
		List<Autores> lstTemp =(List<Autores>) repo.findAll();
		
		for(Autores es : lstTemp) {
			a = new AutoresDTO();
			a.setIdentificacion(es.getIdentificacion());
			a.setApellidos(es.getApellidos());
			a.setNombres(es.getNombres());
			a.setTitulo(es.getTitulo());
			
			lstAutores.add(a);
			}
		return lstAutores;
		}

	}
