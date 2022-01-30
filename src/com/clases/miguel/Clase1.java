package com.clases.miguel;

public class Clase1 {

	public static void main(String[] args) {
		
		
		int entero=21;
		double doble=3.0;
		float flotante=5;
		
		Integer enteroWrapper=2147483647;
		
		System.out.println(enteroWrapper.MAX_VALUE);
		
		Double doubleWrapper=4.0;		
		Float flotanteWrapper=6.0f;
		
		String cadena="Esto es una cadena";
		
		
		System.out.println(entero);
		
		System.out.println(enteroWrapper.compareTo(Integer.valueOf(1)));

		if(enteroWrapper.compareTo(Integer.valueOf(18))<0) {
			System.out.println("Es mayor de edad");			
		}
		
		
		System.out.println(doble);
		System.out.println(doubleWrapper);
		System.out.println(flotante);
		System.out.println(flotanteWrapper);
		System.out.println(cadena);
		
				
	}
}
