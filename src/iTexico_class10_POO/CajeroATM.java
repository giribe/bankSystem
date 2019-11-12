package iTexico_class10_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class CajeroATM {
	
	private ATMManufacture manufactured;
	private ATMLocation location;

	

	private  ArrayList<Person> personas = new ArrayList<Person>();
	
	

	
	public ATMLocation getLocation() {
		return location;
	}

	public void setLocation(ATMLocation location) {
		this.location = location;
	}
	
	
	

	public ATMManufacture getManufactured() {
		return manufactured;
	}

	public void setManufactured(ATMManufacture manufactured) {
		this.manufactured = manufactured;
	}
	
	

	public CajeroATM() {
		
		Person p1 = new Person();
		
		p1.setNombre("Gonzalo");
		p1.setEdad(18);
		p1.setAltura(175);
		p1.setGenero("M");
		p1.setSaldo(123.8f);
		p1.setTarjetaId(12344);
		
		Person p2 = new Person();
		
		p2.setNombre("Marcela");
		p2.setEdad(23);
		p2.setAltura(170);
		p2.setGenero("F");
		p2.setSaldo(3457.8f);
		p2.setTarjetaId(2468);
		
		
		personas.add(p1);
		personas.add(p2);
		
		
		this.location = new ATMLocation();
		this.location.setLatitud(89);
		this.location.setLongitud(78);
		this.location.setMinutos(38);
		this.location.setSegundos(39);
		
		this.manufactured = new ATMManufacture();
		this.manufactured.setName("Hyosung");
		this.manufactured.setCountry("Korean");
		this.manufactured.setYear("1998");
		
		
		
		
		
		
	}
	
	
	
	public void consultarSaldo(int tarjetaId) {
		
		for(int i = 0; i < personas.size(); i++) {
			
				Person p = personas.get(i);
				
				if(tarjetaId == p.getTarjetaId()){
					
					System.out.println(p.getNombre() + ", tu saldo es: $" + p.getSaldo());
					
				}		
				
		}
			
		
	}
	
	public void insertaCliente() {
		
		Person cliente = new Person();
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del cliente: ");
		String nameC = input.next();		
		cliente.setNombre(nameC);
		
		System.out.println("Ingrese la edad del cliente: ");
		int edadC = input.nextInt();		
		cliente.setEdad(edadC);
		
		System.out.println("Ingrese la altura del cliente: ");
		int alturaC = input.nextInt();		
		cliente.setAltura(alturaC);
		
		System.out.println("Ingrese el genero del cliente: ");
		String genC = input.next();		
		cliente.setGenero(genC);
		
		System.out.println("Ingrese el saldo del cliente: ");
		float saldoC = input.nextFloat();		
		cliente.setSaldo(saldoC);
		
		System.out.println("Ingrese el ID del cliente: ");
		int idC = input.nextInt();		
		cliente.setTarjetaId(idC);
		
		
		
		personas.add(cliente);
		
		System.out.println("\n\nNombre: "+ cliente.getNombre() + "\nEdad: "+ cliente.getEdad() + "\nAltura: "+cliente.getAltura() + "\nGenero: "+ cliente.getGenero() + "\nSaldo"+cliente.getSaldo() +
		"\nID: "+ cliente.getTarjetaId());
		
		
		System.out.println("Inserte el cliente no." + "");
		
		
	}
	
	
			
			
			
		
		
	
	
	
	
	

}
