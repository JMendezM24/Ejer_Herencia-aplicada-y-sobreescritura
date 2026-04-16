package dev.herencia.vehiculo;

public class Moto extends Vehiculo{
	private int cilindrada;

	public Moto(String marca, int velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.print("Cilindrada: " + cilindrada + " cc.");
	}

}
