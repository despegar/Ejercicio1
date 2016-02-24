package paquete;

public class PaqueteSaldo implements Paquetes {

	public PaqueteSaldo(double impuesto) {
		this.setImpuesto(impuesto);
	}

	public double getImpuesto() {
		return impuesto;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	private double precioBase;
	private double impuesto;
	
	@Override
	public double getPrecioBase() {
		return this.precioBase;
	}

	public void setPrecioBase(Clientes cliente) {
		this.precioBase = cliente.getSaldo() * 0.1;
	}

	@Override
	public double getPrecioFinal(double impuesto) {
		return getPrecioBase() * impuesto;
	}

}
