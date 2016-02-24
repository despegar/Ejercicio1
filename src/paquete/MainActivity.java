package paquete;

public class MainActivity {
	public static void main(String args[])
	{
		Clientes cliente1 = new Clientes("juan", 2000, 1.3);
		Paquetes paquetehabitaciones = new PaqueteHabitaciones(50, 2);
		Paquetes paquetefijo = new PaqueteFijo(200);
		Paquetes paquetesaldo = new PaqueteSaldo();
		
		PaqueteTuristico paquete1 = new PaqueteTuristico(paquetesaldo);
		
		cliente1.comprarPaquete(paquete1);
		
		System.out.println(cliente1.getSaldo() + "");		
	}
}
