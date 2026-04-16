package dev.herencia.vehiculo;

public class Vehiculo {
	protected String marca;
	protected int velocidad;
	
	public Vehiculo(String marca, int velocidad) {
		this.marca = marca;
		this.velocidad = velocidad;
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Velocidad: " + velocidad + "km/h.");		
	}
}
