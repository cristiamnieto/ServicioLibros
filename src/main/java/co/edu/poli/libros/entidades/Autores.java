package co.edu.poli.libros.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Autores {
	@Id
	private Long identificacion;
	private String nombres;
	private String apellidos;
	private String titulo;
	
	public Autores() {}

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
