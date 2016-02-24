package paquete;

import java.util.ArrayList;

public interface Cliente {
	
	public String getNombre();

	public void setNombre(String nombre);

	public double getSaldo();

	public void setSaldo(double saldo);
	
	public double comprarPaquete(PaqueteTuristico paquete);
	
	public ArrayList<PaqueteTuristico> getListaPaquetesComprados();

	public double getGastosTotales();
}
