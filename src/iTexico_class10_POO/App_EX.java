package iTexico_class10_POO;

import java.util.Scanner;

public class App_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
		
	CajeroATM atm = new CajeroATM();
	
	ATMLocation atmL = new ATMLocation();
	
	ATMManufacture atmM = new ATMManufacture();
	
	Bancos bank = new Bancos();

	OperacionBanco oBank = new OperacionBanco();
	
	
	
	//atm.insertaCliente();
	
	//System.out.println("\\\nIngresa el ID de tu tarjeta");
	
	//int tarjetaId = input.nextInt();
	
	//atm.consultarSaldo(tarjetaId);
	
	/*int lat = atm.getLocation().getLatitud();
	int long = atm.getLocation().getLongitud();
	int min = atm.getLocation().getLatitud();
	int seg = atm.getLocation().getLatitud();*/
	
	//System.out.println("La ubicación del caero es: ");
	
	//atmL.buildString();
	//atmM.buildManufature();
	
	
	System.out.println("\nSelecciona la opción deseada:");
	
	System.out.println("\n1. Agregar Usuarios:");
	System.out.println("\n2. Agregar ATM:");
	System.out.println("\n3. Agregar Clientes:");
	System.out.println("\n4. Agregar Empleados:");
	
	int opcion = input.nextInt();
		
		switch(opcion) {
		
		
			case 1 : 

			break;
			


			case 2 : oBank.agregarATM();
						
			break;


			case 3: oBank.agregarCliente();

			break;



			case 4: oBank.agregarEmpleado();

			break;

	

		}

		//bank.getCajeros().forEach(e -> System.out.println(e.toString()));
		//System.out.println("\nFabricante:" + atm.getManufactured().getName() + "\nPaís: " + atm.getManufactured().getCountry() + "\nAño: " + atm.getManufactured().getYear() );
		//System.out.println("Huevos");
	}

	
}
