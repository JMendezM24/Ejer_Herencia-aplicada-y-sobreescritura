package dev.herencia.producto;

public class Producto {
	 protected String nombre;
	 protected double precio;

	 public Producto(String nombre, double precio) {
	     this.nombre = nombre;
	     this.precio = precio;
	 }

	 public void mostrarInfo() {
	     System.out.println("Producto: " + nombre);
	     System.out.println("Precio: Q" + precio);
	 }

}
