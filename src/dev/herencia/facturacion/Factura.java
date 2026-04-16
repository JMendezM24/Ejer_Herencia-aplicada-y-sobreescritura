package dev.herencia.facturacion;
/*
   Clase base (PADRE)
✔ Aquí se aplica HERENCIA:
   - FacturaContado y FacturaCredito heredan de esta clase

✔ Encapsulamiento:
   - Atributos protegidos y validación en setTotal()

✔ Método clave:
   - calcularTotal() será sobrescrito en las clases hijas
*/
public class Factura {
	protected int numero;
	protected Cliente cliente;
	protected double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente;
		setTotal(total);
	}
	/*
    ✔ Validación:
    - Evita que el total sea negativo
    */
	public void setTotal(double total) {
		if (total < 0) {
			this.total = 0;
		} else {
			this.total = total;
		}
	}
	
    //✔ Método que será sobrescrito
    
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
