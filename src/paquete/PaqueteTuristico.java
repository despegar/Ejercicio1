package paquete;

public class PaqueteTuristico {

	private Paquetes paquete;
	private double precioBase;
	
	public PaqueteTuristico(Paquetes paquete){
		
		this.paquete = paquete;
		this.precioBase = paquete.getPrecioBase();
	}
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	public Paquetes getPaquete() {
		return paquete;
	}
	
	public void setPaquete(Paquetes paquete) {
		this.paquete = paquete;
	}
	
	public double getPrecioFinal(double impuesto) {
		return getPrecioBase() * impuesto;
	}
}
