package paquete;

public class MainActivity {
	public static PaqueteTuristico paquetemascaro;
	public static double preciomascaro = 0;
	public static void main(String args[])
	{
		Individuo cliente1 = new Cliente("juan", 2000);
		Paquetes paquetehabitaciones = new PaqueteHabitaciones(50, 2, 1.2);
		Paquetes paquetefijo = new PaqueteFijo(500, 1.25);
		Paquetes paquetesaldo = new PaqueteSaldo(1.1);

		PaqueteTuristico paquete1 = new PaqueteTuristico(paquetefijo);
		PaqueteTuristico paquete2 = new PaqueteTuristico(paquetehabitaciones);

		double precio = cliente1.comprarPaquete(paquete1);
		
		if(precio > preciomascaro){
			preciomascaro = precio;
			paquetemascaro = paquete1;
		}
		cliente1.comprarPaquete(paquete2);
		System.out.println(preciomascaro + "");
		System.out.println(cliente1.getSaldo() + "");		
		System.out.println(cliente1.getListaPaquetesComprados().size());	
		System.out.println(cliente1.getGastosTotales());	
		
	}
	
	public void validarsieselmascaro(){
		
	}
}
