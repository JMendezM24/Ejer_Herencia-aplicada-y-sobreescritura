package dev.herencia.facturacion;

public class FacturaCredito extends Factura {
	private double recargo;
	private int cuotas;
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
		super(numero, cliente, total);
		this.recargo = recargo;
		this.cuotas = cuotas;
	}
	
	@Override
	public double calcularTotal() {
		return total + recargo;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Recargo: Q" + recargo);
        System.out.println("Cuotas: " + cuotas);
	}

}
