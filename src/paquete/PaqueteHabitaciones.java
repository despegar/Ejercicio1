package paquete;

public class PaqueteHabitaciones implements Paquetes {

	public PaqueteHabitaciones(double cantHabitaciones, double precioPorHabitacion) {
		setPrecioBase(cantHabitaciones, precioPorHabitacion);
	}

	private double precioBase;

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
