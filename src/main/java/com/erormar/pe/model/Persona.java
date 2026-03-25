package com.erormar.pe.model;

import java.util.Date;

public class Persona {
	
	
	
	private Integer id;
	private String nombre;
	private String apellido;
	private Integer edad;
	private boolean casado;
	private Date fNacimiento;
	private double fortuna;
	private String imagen="no-image.png";
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public Date getfNacimiento() {
		return fNacimiento;
	}
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}
	public double getFortuna() {
		return fortuna;
	}
	public void setFortuna(double fortuna) {
		this.fortuna = fortuna;
	}
	
	
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", casado="
				+ casado + ", fNacimiento=" + fNacimiento + ", fortuna=" + fortuna + ", imagen=" + imagen + "]";
	}
	
	
}
