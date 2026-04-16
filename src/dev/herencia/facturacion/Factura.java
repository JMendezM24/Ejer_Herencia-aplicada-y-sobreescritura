package dev.herencia.facturacion;

public class Factura {
	protected int numero;
	protected Cliente cliente;
	protected double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente;
		setTotal(total);
	}

	public void setTotal(double total) {
		if (total < 0) {
			this.total = 0;
		} else {
			this.total = total;
		}
	}
	
	public double calcularTotal() {
		return total;
	}
	
	 public void mostrarInfo() {
	        System.out.println("Factura No: " + numero);
	        System.out.println("Cliente: " + cliente.getNombre());
	        System.out.println("NIT: " + cliente.getNit());
	        System.out.println("Total: Q" + calcularTotal());
	    }
	

}
