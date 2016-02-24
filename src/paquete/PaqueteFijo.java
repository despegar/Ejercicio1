package paquete;

public class PaqueteFijo implements Paquetes {

	public PaqueteFijo(double precioBase, double impuesto) {
		this.precioBase = precioBase;
		this.impuesto = impuesto;

		
	}

	private double precioBase;
	private double impuesto;
	
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

	@Override
	public double getImpuesto() {
		return impuesto;
	}

}
