package paquete;

public class PaqueteHabitaciones implements Paquetes {

	public PaqueteHabitaciones(double cantHabitaciones, double precioPorHabitacion, double impuesto) {
		setPrecioBase(cantHabitaciones, precioPorHabitacion);
		setImpuesto(impuesto);
	}

	private double precioBase;
	private double impuesto;

	public double getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double cantHabitaciones, double precioPorHabitacion) {
		this.precioBase = cantHabitaciones * precioPorHabitacion;
	}

	@Override
	public double getPrecioFinal(double impuesto) {
		return getPrecioBase() * impuesto;
	}
}
