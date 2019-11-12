package iTexico_class10_POO;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMManufacture {
	
	
	private String name;
	private String country;
	private String year;
	
	//private  ArrayList<CajeroATM> cajero = new ArrayList<CajeroATM>();
	
	public void buildManufature() {
		
		CajeroATM atmM = new CajeroATM();
		
		String name = atmM.getManufactured().getName();
		String country = atmM.getManufactured().getCountry();	
		String year = atmM.getManufactured().getYear();
		
		System.out.println("\nManufacture: " + name + ", Country: " + country + ", Year: " + year);
	}
	
	/*public void agregarATM() {
		
		Scanner input = new Scanner(System.in);
		
		CajeroATM atmC = new CajeroATM();
		
		System.out.println("\nCuántos ATM desea dar de alta?: ");
		int noATM = input.nextInt();
			
			for(int i = 0; i < noATM; i++) {
		
				System.out.println("\nIngrese el nombre del Banco: ");
				String nameC = input.next();		
				atmC.setBankName(nameC);
				
				System.out.println("\nIngrese el fabricante del ATM: ");
				String fabC = input.next();		
				atmC.setManufacture(fabC);
				
				System.out.println("\nIngrese el país: ");
				String country = input.next();		
				atmC.setCountry(country);
				
				cajero.add(atmC);
				
				System.out.println("\nNombre: " + atmC.getBankName() + "\nFabricante: " + atmC.getManufacture()+ "\nPaís: "+ atmC.getCountry());
			}
	}*/
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	

}
