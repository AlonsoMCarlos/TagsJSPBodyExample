package edu.ucam.pojo;

import java.util.Date;

public class Pacient {

	private int idPaciente = 0;
	private String nombre = null;
	private String primerApellido = null;
	private String segundoApellido = null;
	private Date fechaNaciemiento = null;

	

	public Pacient(String nombre, String primerApellido, String segundoApellido, Date date) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNaciemiento = date;
		this.idPaciente = 0;
	}
	
	public Pacient(int id, String nombre, String primerApellido, String segundoApellido, Date date) {
		super();
		this.idPaciente = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNaciemiento = date;
		
	}

	public Pacient(int i, String nombre, String primerApellido, String segundoApellido) {
		super();
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaNaciemiento = null;
		this.idPaciente = i;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public Date getFechaNaciemiento() {
		return fechaNaciemiento;
	}

	public void setFechaNaciemiento(Date fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}

}
