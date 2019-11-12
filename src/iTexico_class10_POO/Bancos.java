package iTexico_class10_POO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Bancos {
	
	private ATMLocation location;
	private Cliente cliente;
	private Empleado empleado;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
/*
	
	public void agregarATM() {

		System.out.println("Cuántos cajeros desea dar de alta? ");
		Scanner input = new Scanner(System.in);
		int opcion = input.nextInt();

	
		for(int i=0; i < opcion; i++) {

			CajeroATM b1 = new CajeroATM();

			System.out.println("Ingrese el nombre del fabricante: ");
			String nameC = input.next();
			b1.getManufactured().setName(nameC);

			System.out.println("Ingrese el país de origen: ");
			String paisC = input.next();
			b1.getManufactured().setCountry(paisC);

			System.out.println("Ingrese el año: ");
			String yearC = input.next();
			b1.getManufactured().setYear(yearC);

			cajeros.add(b1);



		}

		for (int y = 0; y < cajeros.size(); y++) {

			System.out.println("\nCajero - " + y);
			System.out.println("\nFabriante: " + cajeros.get(y).getManufactured().getName());
			System.out.println("País: " + cajeros.get(y).getManufactured().getCountry());
			System.out.println("Año: " + cajeros.get(y).getManufactured().getYear());

		}


	}

	public void agregarCliente(){

		System.out.println("Cuántos clientes desea dar de alta? ");
		Scanner input = new Scanner(System.in);
		int opcion = input.nextInt();

		for(int i=0; i < opcion; i++) {

			Cliente cliente = new Cliente();

			System.out.println("Ingrese el ID del cliente: ");
			int  clientId = input.nextInt();
			cliente.setId(clientId);

			System.out.println("Ingrese el nombre del Cliente ");
			String  clientName = input.next();
			cliente.setNombre(clientName);

			clientes.add(cliente);


		}
		for (int y = 0; y < clientes.size(); y++) {

			System.out.println("\nCliente No. - " + y);
			System.out.println("\nNombre: " + clientes.get(y).getNombre());
			System.out.println("ID: " + clientes.get(y).getId());


		}


	}

*/








	public ATMLocation getLocation() {
		return location;
	}




	public void setLocation(ATMLocation location) {
		this.location = location;
	}







}
