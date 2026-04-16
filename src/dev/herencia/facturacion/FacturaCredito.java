package dev.herencia.facturacion;
/*
📌 Clase hija de Factura

✔ HERENCIA:
   - Extiende de Factura

✔ SOBRESCRITURA:
   - calcularTotal() → agrega recargo
   - mostrarInfo() → agrega información adicional

✔ Lógica:
   - Aumenta el total según el recargo
*/
public class FacturaCredito extends Factura {
	private double recargo;
	private int cuotas;
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
		super(numero, cliente, total); // uso de super
		this.recargo = recargo;
		this.cuotas = cuotas;
	}
	
	@Override
	public double calcularTotal() {
		return total + recargo;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();  // reutiliza código del padre
		System.out.println("Recargo: Q" + recargo);
        System.out.println("Cuotas: " + cuotas);
	}

}
