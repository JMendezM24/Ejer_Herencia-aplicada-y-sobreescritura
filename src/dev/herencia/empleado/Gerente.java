package dev.herencia.empleado;

public class Gerente extends Empleado {
	protected double bono;

	public Gerente(String nombre, double salario, double bono) {
		super(nombre, salario);
		this.bono = bono;
	}
	
	@Override
	public double calcularSalario() {
		return salario + bono;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Gerente: " + nombre);
	    System.out.println("Salario: Q" + calcularSalario());
	    System.out.println("Bono: Q" + bono);
	}

}
