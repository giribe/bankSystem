package iTexico_class10_POO;

import java.util.Scanner;

public class POO_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa la cadena de texto: ");
		String cadena = input.next();
		
		int contador = 0;
		
		for(int i = 0; i < cadena.length(); i++) {
			
			if ((cadena.charAt(i)=='a') || (cadena.charAt(i)=='e') || (cadena.charAt(i)=='i') || (cadena.charAt(i)=='o') || (cadena.charAt(i)=='u')){
			 
				contador++;
			}
			
			
			
		}
		System.out.println("Número de vocales: " + contador);
	
		
	}

}
