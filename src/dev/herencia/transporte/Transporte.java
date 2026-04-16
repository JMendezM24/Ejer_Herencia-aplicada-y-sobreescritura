package dev.herencia.transporte;

public class Transporte {
	protected int capacidad;

	public Transporte(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public void descripcion() {
		System.out.print("Capacidad: " + capacidad + " pasajeros. \n"); 
	}

}
