package paquete;

public class MainActivity {
	public static void main(String args[])
	{
		Clientes cliente1 = new Clientes("juan", 2000, 1.1);
		Paquetes paquetehabitaciones = new PaqueteHabitaciones(100, 4);
		Paquetes paquetefijo = new PaqueteFijo(100);
		Paquetes paquetesaldo = new PaqueteSaldo();
		
		PaqueteTuristico paquete1 = new PaqueteTuristico(paquetefijo);
		
		cliente1.comprarPaquete(paquete1);
		
		System.out.println(cliente1.getSaldo() + "");		
	}
}
