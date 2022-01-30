package com.clases.miguel;

import com.clases.miguel.models.Estudiante;
import com.clases.miguel.models.Persona4;

public class Clase6 {
	
	public static void main(String[] args) {
		
		Estudiante estudiante= new Estudiante();
		
		Persona4 persona = new Persona4();
		
		estudiante.setCarrera("Computación");
		estudiante.setSemestre(2);
		estudiante.setNombre("Miguel");
		
		persona.setNombre("Juan");
		
		System.out.println(persona.suma(2, 2));
		
		System.out.println(estudiante.suma(2, 2));		
		
		
		
		System.out.println(estudiante);
		System.out.println(persona);		
		
						
	}

}
