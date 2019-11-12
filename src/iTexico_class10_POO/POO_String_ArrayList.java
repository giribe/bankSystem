package iTexico_class10_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class POO_String_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa la cadena de texto: ");
		String cadena = input.next();
		
        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");
       
        for(int i = 0; i < cadena.length(); i++) {
        	
            if(vocales.contains( String.valueOf(cadena.charAt(i)) )) {
               
            }
        }
		
		
		
	}

}
