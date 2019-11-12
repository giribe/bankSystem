package iTexico_class10_POO;

public class ATMLocation {

	private int latitud;
	private int longitud;
	private int minutos;
	private int segundos;
	
	
	
public void buildString(/*int latitud, int longitud, int minutos, int segundos*/) {
		
		CajeroATM atm = new CajeroATM();
		
		int latitud = atm.getLocation().getLatitud();
		int longitud = atm.getLocation().getLongitud();
		int minutos = atm.getLocation().getLatitud();
		int segundos = atm.getLocation().getLatitud();
		
		
		
		
		System.out.println("\nEl cajero se encuentra en: "+ latitud + "' "+ longitud +"' "+ minutos +"' "+ segundos);
		
		
		/*this.latitud =loc.getLatitud();
		this.longitud = loc.getLongitud();
		this.minutos =loc.getMinutos();
		this.segundos = loc.getSegundos();
		
		System.out.println(latitud + longitud + minutos + segundos );*/
		
	}
	
	
	
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	

}
