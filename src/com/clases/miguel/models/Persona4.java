package com.clases.miguel.models;

public class Persona4 {
	
	private String nombre;
	private Integer edad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Persona4(String nombre, Integer edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	

	public Persona4() {
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public int suma(int a,int b) {
		return a+b;
		
	}
	
	
	
	
	
	
	
	
	

}
