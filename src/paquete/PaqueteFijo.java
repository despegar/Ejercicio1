package paquete;

public class PaqueteFijo implements Paquetes {

	public PaqueteFijo(double precioBase) {
		this.precioBase = precioBase;
	}

	private double precioBase;
	
	@Override
	public double getPrecioBase() {
		return this.precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	@Override
	public double getPrecioFinal(double impuesto) {
		return getPrecioBase() * impuesto;
	}

}
