package com.clases.miguel;

import com.clases.miguel.models.Estudiante;
import com.clases.miguel.models.Persona4;

public class Clase6 {
	
	public static void main(String[] args) {
		
		Estudiante estudiante= new Estudiante();
		
		Persona4 persona = new Estudiante();
		
		estudiante.setCarrera("Computaci�n");
		estudiante.setSemestre(2);
		estudiante.setNombre("Miguel");
		
		persona.setNombre("Juan");
		
		
		System.out.println(estudiante);
		System.out.println(persona);		
		
						
	}

}
