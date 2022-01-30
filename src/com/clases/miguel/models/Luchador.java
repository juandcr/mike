package com.clases.miguel.models;

public class Luchador {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void volar() {
		System.out.println("Estoy volando");
	}
	
	public void volar(int cuerdas) {
		System.out.println("Estoy volando desde la " + cuerdas + "cuerda");
	}

}
