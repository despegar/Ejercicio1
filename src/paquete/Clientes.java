package paquete;

import java.util.ArrayList;

public class Clientes {
	
	private ArrayList<PaqueteTuristico> listaPaquetesComprados = new ArrayList<PaqueteTuristico>();	
	private String nombre;
	private double saldo;
	private int gastosTotales = 0;
	
	public Clientes(String nombre, double saldo){
		this.nombre = nombre;
		this.saldo = saldo;
		
	}
	
	public String getNombre() {
		return nombre;
	}	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double comprarPaquete(PaqueteTuristico paquete){
		if(paquete.getPaquete().getClass() == PaqueteSaldo.class)
		{
			paquete.setPrecioBase(this.saldo * 0.1);
		}
		if(this.saldo > paquete.getPrecioFinal(paquete.getPaquete().getImpuesto()))
		{
			this.saldo -= paquete.getPrecioFinal(paquete.getPaquete().getImpuesto());
			this.gastosTotales += paquete.getPrecioFinal(paquete.getPaquete().getImpuesto());
			this.listaPaquetesComprados.add(paquete);
		}
		return paquete.getPrecioFinal(paquete.getPaquete().getImpuesto());
		
	}
	
	public ArrayList<PaqueteTuristico> getListaPaquetesComprados() {
		return listaPaquetesComprados;
	}

	public int getGastosTotales() {
		return gastosTotales;
	}


	
	
	

}
