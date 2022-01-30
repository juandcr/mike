package com.clases.miguel.models;

public class Estudiante extends Persona4 {
	
	
	
	public Estudiante(String nombre, Integer edad) {
		super(nombre, edad);
	}
	public Estudiante(String nombre, Integer edad,String carrera, Integer semestre, Double promedio) {
		super(nombre, edad);
		this.carrera=carrera;
		this.semestre=semestre;
		this.promedio=promedio;
	}
	
	public Estudiante() {
		super();
	}
	
	private String carrera;
	private Integer semestre;
	private Double promedio;
	
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public Double getPromedio() {
		return promedio;
	}
	public void setPromedio(Double promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "Estudiante [carrera=" + carrera + ", semestre=" + semestre + ", promedio=" + promedio + "]";
	}
	
	
	
	

}
