package dev.herencia.facturacion;
/*
Clase hija de Factura

✔ HERENCIA:
- Extiende de Factura

✔ SOBRESCRITURA:
- Se sobrescribe calcularTotal()

✔ Lógica:
- Aplica descuento al total
- Evita que el resultado sea negativo
*/
public class FacturaContado extends Factura {
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total); // uso de super
		this.descuento = descuento;
	}
	
	@Override
	public double calcularTotal() {
		double totalFinal = total - descuento;
		// validacio, no permitir negativos
		return (totalFinal < 0) ? 0 : totalFinal;
	}

}
