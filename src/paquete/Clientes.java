package paquete;

public class Clientes {
	
	private String nombre;
	private double saldo;
	private double impuesto;
	
	public Clientes(String nombre, double saldo, double impuesto){
		this.nombre = nombre;
		this.saldo = saldo;
		this.impuesto = impuesto;
		
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

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	
	public double comprarPaquete(PaqueteTuristico paquete){
		if(paquete.getPaquete().getClass() == PaqueteSaldo.class)
		{
			paquete.setPrecioBase(this.saldo * 0.1);
		}
		if(this.saldo > paquete.getPrecioFinal(this.impuesto))
		{
			this.saldo -= paquete.getPrecioFinal(this.impuesto);
		}
		return paquete.getPrecioFinal(this.impuesto);
		
	}

	
	
	

}
